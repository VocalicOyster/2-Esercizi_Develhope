package com.devlhope.DemoH2.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table
public class students {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String lastName;
    private String firstName;
    private String email;

}
