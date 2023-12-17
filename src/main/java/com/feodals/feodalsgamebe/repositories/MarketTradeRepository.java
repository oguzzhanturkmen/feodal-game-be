package com.feodals.feodalsgamebe.repositories;

import com.feodals.feodalsgamebe.entities.MarketTrade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface MarketTradeRepository extends JpaRepository<MarketTrade, Long> {

}
