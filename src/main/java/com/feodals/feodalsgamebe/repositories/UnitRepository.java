package com.feodals.feodalsgamebe.repositories;

import com.feodals.feodalsgamebe.entities.Unit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UnitRepository extends JpaRepository<Unit, Long> {

}
