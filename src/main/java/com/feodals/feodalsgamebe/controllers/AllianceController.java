package com.feodals.feodalsgamebe.controllers;

import com.feodals.feodalsgamebe.entities.Alliance;
import com.feodals.feodalsgamebe.services.AllianceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
@RequestMapping("/alliances")
public class AllianceController {

    private final AllianceService allianceService;

    @Autowired
    public AllianceController(AllianceService allianceService) {
        this.allianceService = allianceService;
    }

    @PostMapping
    public ResponseEntity<Alliance> createAlliance(@RequestBody Alliance alliance) {
        return ResponseEntity.ok(allianceService.createAlliance(alliance));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Alliance> getAllianceById(@PathVariable Long id) {
        return allianceService.getAllianceById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping
    public List<Alliance> getAllAlliances() {
        return allianceService.getAllAlliances();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Alliance> updateAlliance(@PathVariable Long id, @RequestBody Alliance alliance) {
        return allianceService.getAllianceById(id)
                .map(a -> {
                    alliance.setId(id);
                    return ResponseEntity.ok(allianceService.updateAlliance(alliance));
                })
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteAlliance(@PathVariable Long id) {
        if (allianceService.getAllianceById(id).isPresent()) {
            allianceService.deleteAlliance(id);
            return ResponseEntity.ok().build();
        }
        return ResponseEntity.notFound().build();
    }
}
