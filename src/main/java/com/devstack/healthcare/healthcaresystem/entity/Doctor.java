package com.devstack.healthcare.healthcaresystem.entity;


import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Doctor {

    @Id
    private long id;

    private String name;
    private String address;
    private String contact;
    private double salary;
}
