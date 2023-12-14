package com.feodals.feodalsgamebe.entities;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;


@Entity
public class Resource {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(length = 500)
    private String description; // A brief description of the resource

    // You can add more fields here, such as base production rate, if relevant

    @OneToMany(mappedBy = "resource", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<VillageResource> villageResources = new HashSet<>();
}

