package com.develhope.demoHalEx.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String modelName;

    @Column(nullable = false)
    private String serialNumber;

    @Column(nullable = true)
    private float currentPrice;
}
