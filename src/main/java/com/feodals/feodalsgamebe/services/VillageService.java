package com.feodals.feodalsgamebe.services;

import com.feodals.feodalsgamebe.entities.Village;
import com.feodals.feodalsgamebe.repositories.VillageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;


@Service
public class VillageService {

    private final VillageRepository villageRepository;

    @Autowired
    public VillageService(VillageRepository villageRepository) {
        this.villageRepository = villageRepository;
    }

    public Village createVillage(Village village) {
        return villageRepository.save(village);
    }

    public Optional<Village> getVillageById(Long id) {
        return villageRepository.findById(id);
    }

    public List<Village> getAllVillages() {
        return villageRepository.findAll();
    }

    public Village updateVillage(Village village) {
        return villageRepository.save(village);
    }

    public void deleteVillage(Long id) {
        villageRepository.deleteById(id);
    }
}
