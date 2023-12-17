package com.feodals.feodalsgamebe.services;

import com.feodals.feodalsgamebe.entities.Tribe;
import com.feodals.feodalsgamebe.repositories.TribeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;


@Service
public class TribeService {

    private final TribeRepository tribeRepository;

    @Autowired
    public TribeService(TribeRepository tribeRepository) {
        this.tribeRepository = tribeRepository;
    }

    public Tribe createTribe(Tribe tribe) {
        return tribeRepository.save(tribe);
    }

    public Optional<Tribe> getTribeById(Long id) {
        return tribeRepository.findById(id);
    }

    public List<Tribe> getAllTribes() {
        return tribeRepository.findAll();
    }

    public Tribe updateTribe(Tribe tribe) {
        return tribeRepository.save(tribe);
    }

    public void deleteTribe(Long id) {
        tribeRepository.deleteById(id);
    }
}
