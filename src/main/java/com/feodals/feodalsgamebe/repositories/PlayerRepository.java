package com.feodals.feodalsgamebe.repositories;

import com.feodals.feodalsgamebe.entities.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PlayerRepository extends JpaRepository<Player, Long> {

}
