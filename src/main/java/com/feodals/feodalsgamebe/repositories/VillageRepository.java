package com.feodals.feodalsgamebe.repositories;

import com.feodals.feodalsgamebe.entities.Village;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface VillageRepository extends JpaRepository<Village, Long> {

}
