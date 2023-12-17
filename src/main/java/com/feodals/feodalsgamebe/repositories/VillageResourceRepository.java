package com.feodals.feodalsgamebe.repositories;

import com.feodals.feodalsgamebe.entities.VillageResource;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface VillageResourceRepository extends JpaRepository<VillageResource, Long> {

}
