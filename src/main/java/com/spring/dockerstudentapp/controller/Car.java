package com.spring.dockerstudentapp.controller;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Car {

    @Id
    private int id;

    private String name;
}
