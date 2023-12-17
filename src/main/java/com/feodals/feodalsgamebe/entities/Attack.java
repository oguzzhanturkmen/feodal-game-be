package com.feodals.feodalsgamebe.entities;

import jakarta.persistence.*;
import lombok.Data;


import java.util.Date;

@Entity
@Data
public class Attack {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "origin_village_id", nullable = false)
    private Village originVillage;

    @ManyToOne
    @JoinColumn(name = "target_village_id", nullable = false)
    private Village targetVillage;

    @Temporal(TemporalType.TIMESTAMP)
    private Date departureTime;

    @Temporal(TemporalType.TIMESTAMP)
    private Date arrivalTime;

    @Column(nullable = false)
    private String outcome; // e.g., Victory, Defeat


}

