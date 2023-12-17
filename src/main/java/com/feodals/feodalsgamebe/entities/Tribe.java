package com.feodals.feodalsgamebe.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;

@Entity
@Data
public class Tribe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String speciality; // Unique traits or bonuses

    @OneToMany(mappedBy = "tribe")
    private Set<Player> players;

    // Constructors, getters, and setters
}

