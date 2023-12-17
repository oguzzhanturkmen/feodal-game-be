package com.feodals.feodalsgamebe.repositories;

import com.feodals.feodalsgamebe.entities.Resource;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ResourceRepository extends JpaRepository<Resource, Long> {

}
