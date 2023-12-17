package com.feodals.feodalsgamebe.services;

import com.feodals.feodalsgamebe.entities.Building;
import com.feodals.feodalsgamebe.repositories.BuildingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;


@Service
public class BuildingService {

    private final BuildingRepository buildingRepository;

    @Autowired
    public BuildingService(BuildingRepository buildingRepository) {
        this.buildingRepository = buildingRepository;
    }

    public Building constructBuilding(Building building) {
        return buildingRepository.save(building);
    }

    public Optional<Building> getBuildingById(Long id) {
        return buildingRepository.findById(id);
    }

    public List<Building> getAllBuildings() {
        return buildingRepository.findAll();
    }

    public Building updateBuilding(Building building) {
        return buildingRepository.save(building);
    }

    public void deleteBuilding(Long id) {
        buildingRepository.deleteById(id);
    }
}
