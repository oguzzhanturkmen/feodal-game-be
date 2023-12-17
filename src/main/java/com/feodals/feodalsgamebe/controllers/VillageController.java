package com.feodals.feodalsgamebe.controllers;

import com.feodals.feodalsgamebe.entities.Village;
import com.feodals.feodalsgamebe.services.VillageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
@RequestMapping("/villages")
public class VillageController {

    private final VillageService villageService;

    @Autowired
    public VillageController(VillageService villageService) {
        this.villageService = villageService;
    }

    @PostMapping
    public ResponseEntity<Village> createVillage(@RequestBody Village village) {
        return ResponseEntity.ok(villageService.createVillage(village));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Village> getVillageById(@PathVariable Long id) {
        return villageService.getVillageById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping
    public List<Village> getAllVillages() {
        return villageService.getAllVillages();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Village> updateVillage(@PathVariable Long id, @RequestBody Village village) {
        return villageService.getVillageById(id)
                .map(v -> {
                    village.setId(id);
                    return ResponseEntity.ok(villageService.updateVillage(village));
                })
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteVillage(@PathVariable Long id) {
        if (villageService.getVillageById(id).isPresent()) {
            villageService.deleteVillage(id);
            return ResponseEntity.ok().build();
        }
        return ResponseEntity.notFound().build();
    }
}
