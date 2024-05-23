package co.develhope.studentCrudTest.services;

import co.develhope.studentCrudTest.entities.Student;
import co.develhope.studentCrudTest.repositories.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServices {

    @Autowired
    private StudentRepo studentRepo;

//    public Student setIsWorking(Long id, String isWorking) {
//        Optional<Student> student = studentRepo.findById(id);
//
//        if (student.isEmpty()) return null;
//
//        Student student1 = student.get();
//        if(Objects.equals(isWorking, "true")) {
//            student1.setWorking(true);
//        }
//        if(Objects.equals(isWorking, "false")) {
//            student1.setWorking(false);
//        }
//
//        studentRepo.saveAndFlush(student1);
//
//        return student1;
//    }

    public void createStudent(Student student){
        studentRepo.saveAndFlush(student);
    }

    public List<Student> getAll() {
        return studentRepo.findAll();
    }

    public Student getStudentById(Long id) {
        Optional<Student> student = studentRepo.findById(id);
        return student.orElse(null);
    }

    public Student updateStudent(Long id, String name, String surname) {
        Optional<Student> student = studentRepo.findById(id);
        if (student.isPresent()) {
            student.get().setName(name);
            student.get().setName(name);
            studentRepo.saveAndFlush(student.get());
            return student.get();
        }

        return null;
    }

    public Student deleteStudent(Long id) {
        Optional<Student> student = studentRepo.findById(id);
        if(student.isPresent()) {
            studentRepo.deleteById(id);
            return student.get();
        }
        return null;
    }
}
