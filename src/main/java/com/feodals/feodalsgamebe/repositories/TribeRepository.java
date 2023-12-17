package com.feodals.feodalsgamebe.repositories;

import com.feodals.feodalsgamebe.entities.Tribe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface TribeRepository extends JpaRepository<Tribe, Long> {

}
