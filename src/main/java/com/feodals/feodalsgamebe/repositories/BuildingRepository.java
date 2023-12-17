package com.feodals.feodalsgamebe.repositories;

import com.feodals.feodalsgamebe.entities.Building;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface BuildingRepository extends JpaRepository<Building, Long> {

}
