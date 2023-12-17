package com.feodals.feodalsgamebe.controllers;

import com.feodals.feodalsgamebe.entities.Building;
import com.feodals.feodalsgamebe.services.BuildingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
@RequestMapping("/buildings")
public class BuildingController {

    private final BuildingService buildingService;

    @Autowired
    public BuildingController(BuildingService buildingService) {
        this.buildingService = buildingService;
    }

    @PostMapping
    public ResponseEntity<Building> constructBuilding(@RequestBody Building building) {
        return ResponseEntity.ok(buildingService.constructBuilding(building));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Building> getBuildingById(@PathVariable Long id) {
        return buildingService.getBuildingById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping
    public List<Building> getAllBuildings() {
        return buildingService.getAllBuildings();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Building> updateBuilding(@PathVariable Long id, @RequestBody Building building) {
        return buildingService.getBuildingById(id)
                .map(b -> {
                    building.setId(id);
                    return ResponseEntity.ok(buildingService.updateBuilding(building));
                })
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteBuilding(@PathVariable Long id) {
        if (buildingService.getBuildingById(id).isPresent()) {
            buildingService.deleteBuilding(id);
            return ResponseEntity.ok().build();
        }
        return ResponseEntity.notFound().build();
    }
}
