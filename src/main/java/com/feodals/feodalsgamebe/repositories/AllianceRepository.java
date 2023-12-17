package com.feodals.feodalsgamebe.repositories;

import com.feodals.feodalsgamebe.entities.Alliance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AllianceRepository extends JpaRepository<Alliance, Long> {

}
