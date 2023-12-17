package com.feodals.feodalsgamebe.services;

import com.feodals.feodalsgamebe.entities.Alliance;
import com.feodals.feodalsgamebe.repositories.AllianceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;


@Service
public class AllianceService {

    private final AllianceRepository allianceRepository;

    @Autowired
    public AllianceService(AllianceRepository allianceRepository) {
        this.allianceRepository = allianceRepository;
    }

    public Alliance createAlliance(Alliance alliance) {
        return allianceRepository.save(alliance);
    }

    public Optional<Alliance> getAllianceById(Long id) {
        return allianceRepository.findById(id);
    }

    public List<Alliance> getAllAlliances() {
        return allianceRepository.findAll();
    }

    public Alliance updateAlliance(Alliance alliance) {
        return allianceRepository.save(alliance);
    }

    public void deleteAlliance(Long id) {
        allianceRepository.deleteById(id);
    }
}
