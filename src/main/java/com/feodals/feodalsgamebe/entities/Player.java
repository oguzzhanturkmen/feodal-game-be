package com.feodals.feodalsgamebe.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
import java.util.Set;

@Entity
@Data
public class Player {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String username;

    @Column(nullable = false)
    private String password; // Consider encryption for storage

    @Column(nullable = false, unique = true)
    private String email;

    @Temporal(TemporalType.TIMESTAMP)
    private Date registrationDate;

    @Temporal(TemporalType.TIMESTAMP)
    private Date lastLogin;

    @OneToMany(mappedBy = "player")
    private Set<Village> villages;

}

