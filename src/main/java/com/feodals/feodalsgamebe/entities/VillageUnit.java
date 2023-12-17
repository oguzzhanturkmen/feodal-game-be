package com.feodals.feodalsgamebe.entities;

import jakarta.persistence.*;
import lombok.Data;


@Entity
@Data
public class VillageUnit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "village_id", nullable = false)
    private Village village;

    @ManyToOne
    @JoinColumn(name = "unit_id", nullable = false)
    private Unit unit;

    @Column(nullable = false)
    private Integer quantity;


}
