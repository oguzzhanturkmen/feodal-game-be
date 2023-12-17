package com.feodals.feodalsgamebe.controllers;

import com.feodals.feodalsgamebe.entities.Tribe;
import com.feodals.feodalsgamebe.services.TribeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
@RequestMapping("/tribes")
public class TribeController {

    private final TribeService tribeService;

    @Autowired
    public TribeController(TribeService tribeService) {
        this.tribeService = tribeService;
    }

    @PostMapping
    public ResponseEntity<Tribe> createTribe(@RequestBody Tribe tribe) {
        return ResponseEntity.ok(tribeService.createTribe(tribe));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Tribe> getTribeById(@PathVariable Long id) {
        return tribeService.getTribeById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping
    public List<Tribe> getAllTribes() {
        return tribeService.getAllTribes();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Tribe> updateTribe(@PathVariable Long id, @RequestBody Tribe tribe) {
        return tribeService.getTribeById(id)
                .map(t -> {
                    tribe.setId(id);
                    return ResponseEntity.ok(tribeService.updateTribe(tribe));
                })
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteTribe(@PathVariable Long id) {
        if (tribeService.getTribeById(id).isPresent()) {
            tribeService.deleteTribe(id);
            return ResponseEntity.ok().build();
        }
        return ResponseEntity.notFound().build();
    }
}
