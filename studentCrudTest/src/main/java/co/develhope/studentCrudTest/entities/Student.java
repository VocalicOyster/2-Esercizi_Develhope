package co.develhope.studentCrudTest.entities;

import jakarta.persistence.*;

@Entity
@Table
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    private String surname;


    public Student(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }


    public Student() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

//    public boolean isWorking() {
//        return isWorking;
//    }
//
//    public void setWorking(boolean working) {
//        isWorking = working;
//    }
}
