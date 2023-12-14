package com.feodals.feodalsgamebe.entities;


import jakarta.persistence.*;

import java.util.Date;
import java.util.Set;

@Entity
public class Village {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "player_id", nullable = false)
    private Player player;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private Integer locationX;

    @Column(nullable = false)
    private Integer locationY;

    @Temporal(TemporalType.TIMESTAMP)
    private Date creationDate;

    @OneToMany(mappedBy = "village")
    private Set<Building> buildings;

    // Other relationships like resources, troops

}
