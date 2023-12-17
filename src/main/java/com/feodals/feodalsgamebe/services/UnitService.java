package com.feodals.feodalsgamebe.services;

import com.feodals.feodalsgamebe.entities.Unit;
import com.feodals.feodalsgamebe.repositories.UnitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;


@Service
public class UnitService {

    private final UnitRepository unitRepository;

    @Autowired
    public UnitService(UnitRepository unitRepository) {
        this.unitRepository = unitRepository;
    }

    public Unit trainUnit(Unit unit) {
        return unitRepository.save(unit);
    }

    public Optional<Unit> getUnitById(Long id) {
        return unitRepository.findById(id);
    }

    public List<Unit> getAllUnits() {
        return unitRepository.findAll();
    }

    public Unit updateUnit(Unit unit) {
        return unitRepository.save(unit);
    }

    public void deleteUnit(Long id) {
        unitRepository.deleteById(id);
    }
}
