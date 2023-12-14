package com.feodals.feodalsgamebe.entities;

import jakarta.persistence.*;


@Entity
public class Unit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String type; // e.g., Soldier, Cavalry, etc.

    @Column(nullable = false)
    private Integer attackPower;

    @Column(nullable = false)
    private Integer defensePower;

    // Other unit-specific attributes like speed, carrying capacity


}
