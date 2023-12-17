package com.feodals.feodalsgamebe.repositories;

import com.feodals.feodalsgamebe.entities.Attack;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AttackRepository extends JpaRepository<Attack, Long> {

}
