package Es_ArrayList1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Giovanni", 24);
        Student student2 = new Student("Claudia", 24);
        Student student3 = new Student("Franco", 24);
        Student student4 = new Student("Gianluca", 24);

        List<Student> students = new ArrayList(Arrays.asList(student2, student1));
        System.out.println(students);

        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);

        System.out.println(students);



    }
}
