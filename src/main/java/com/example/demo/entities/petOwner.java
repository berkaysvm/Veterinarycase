package com.example.demo.entities;

import javax.persistence.*;

@Entity
@Table(name = "pet_owner")
public class petOwner {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "lastname")
    private String lastname;

    @Column(name = "address")
    private String address;

    @Column(name ="phone_number")
    private String phoneNumber;

    @Column(name = "e_mail")
    private String EMail;



}
