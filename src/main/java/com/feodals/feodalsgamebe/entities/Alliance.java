package com.feodals.feodalsgamebe.entities;

import jakarta.persistence.*;

import java.util.Date;
import java.util.Set;

@Entity
public class Alliance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Temporal(TemporalType.TIMESTAMP)
    private Date creationDate;

    @OneToMany(mappedBy = "alliance")
    private Set<Player> members;

}
