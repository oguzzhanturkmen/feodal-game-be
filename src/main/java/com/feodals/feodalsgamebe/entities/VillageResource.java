package com.feodals.feodalsgamebe.entities;

import jakarta.persistence.*;
import lombok.Data;


import java.util.Date;

@Entity
@Data
public class VillageResource {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "village_id", nullable = false)
    private Village village;

    @ManyToOne
    @JoinColumn(name = "resource_id", nullable = false)
    private Resource resource;

    @Column(nullable = false)
    private Long quantity;

    @Temporal(TemporalType.TIMESTAMP)
    private Date lastUpdated;


}

