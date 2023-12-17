package com.feodals.feodalsgamebe.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
import java.util.Set;

@Entity
@Data
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
