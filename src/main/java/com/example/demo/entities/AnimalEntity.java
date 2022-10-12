package com.example.demo.entities;

import javax.persistence.*;

@Entity
@Table(name="animal")
public class AnimalEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "species")
    private String species;

    @Column(name = "genus")
    private String genus;
    @Column(name = "name")
    private String name;

    @Column(name = "age")
    private int age;

    @Column(name = "explanation")
    private String explanation;




}
