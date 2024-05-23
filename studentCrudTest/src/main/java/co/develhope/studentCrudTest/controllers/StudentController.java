package co.develhope.studentCrudTest.controllers;

import co.develhope.studentCrudTest.entities.Student;
import co.develhope.studentCrudTest.services.StudentServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    StudentServices studentServices;

    @GetMapping("/")
    public List<Student> getAllStudent() {
        return studentServices.getAll();
    }

    @GetMapping("/{id}")
    public Student getStudentById(@PathVariable Long id) {
        return studentServices.getStudentById(id);
    }

    @PostMapping("/")
    public Student createStudent(@RequestBody Student student) {
        studentServices.createStudent(student);
        return student;
    }

    @PutMapping("/{id}")
    public Student updateStudent(@PathVariable Long id, @RequestParam String name, @RequestParam String surname) {
        return studentServices.updateStudent(id, name, surname);
    }

    @DeleteMapping("/{id}")
    public Student deleteStudent(@PathVariable Long id) {
        return studentServices.deleteStudent(id);
    }
}
