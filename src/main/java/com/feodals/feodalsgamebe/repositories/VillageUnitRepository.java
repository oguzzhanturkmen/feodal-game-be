package com.feodals.feodalsgamebe.repositories;

import com.feodals.feodalsgamebe.entities.VillageUnit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface VillageUnitRepository extends JpaRepository<VillageUnit, Long> {

}
