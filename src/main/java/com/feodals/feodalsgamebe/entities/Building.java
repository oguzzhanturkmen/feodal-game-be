package com.feodals.feodalsgamebe.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Data
public class Building {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "village_id", nullable = false)
    private Village village;

    @Column(nullable = false)
    private String type; // Barracks, Farm, etc.

    @Column(nullable = false)
    private Integer level;

    @Temporal(TemporalType.TIMESTAMP)
    private Date constructionStart;

    @Temporal(TemporalType.TIMESTAMP)
    private Date constructionEnd;


}

