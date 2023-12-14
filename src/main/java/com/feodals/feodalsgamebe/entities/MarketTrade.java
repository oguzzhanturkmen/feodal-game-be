package com.feodals.feodalsgamebe.entities;


import jakarta.persistence.*;

@Entity
public class MarketTrade {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "offering_village_id", nullable = false)
    private Village offeringVillage;

    @ManyToOne
    @JoinColumn(name = "requesting_village_id", nullable = false)
    private Village requestingVillage;

    @ManyToOne
    @JoinColumn(name = "resource_id", nullable = false)
    private Resource resource;

    @Column(nullable = false)
    private Long quantity;

    @Column(nullable = false)
    private String tradeStatus; // e.g., Pending, Completed


}
