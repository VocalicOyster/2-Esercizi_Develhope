package Develhope_Ex.Es_ArrayList2;
import Es_ArrayList1.Student;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Es_ArrayList1.Student student1 = new Es_ArrayList1.Student("Aiovanni", 24);
        Es_ArrayList1.Student student2 = new Es_ArrayList1.Student("Blaudia", 24);
        Es_ArrayList1.Student student3 = new Es_ArrayList1.Student("Franco", 24);
        Es_ArrayList1.Student student4 = new Es_ArrayList1.Student("Dianluca", 24);
        Es_ArrayList1.Student student5 = new Es_ArrayList1.Student("Cianluca", 24);
        Es_ArrayList1.Student student6 = new Es_ArrayList1.Student("Lianluca", 24);
        Es_ArrayList1.Student student7 = new Es_ArrayList1.Student("Gianluca", 24);
        Es_ArrayList1.Student student8 = new Es_ArrayList1.Student("Zianluca", 24);
        Es_ArrayList1.Student student9 = new Es_ArrayList1.Student("Pianluca", 24);
        Es_ArrayList1.Student student10 = new Es_ArrayList1.Student("Oianluca", 24);
        Es_ArrayList1.Student student11 = new Es_ArrayList1.Student("Qianluca", 24);
        Es_ArrayList1.Student student12 = new Es_ArrayList1.Student("Yianluca", 24);



        List<Student> students = new ArrayList(Arrays.asList(student2, student1, student3, student4, student5,
                student6, student7, student8, student9, student10, student11, student12));

        System.out.println(students);

        students.sort(Comparator.comparing(Student::getName));
        System.out.println(students);
    }
}
