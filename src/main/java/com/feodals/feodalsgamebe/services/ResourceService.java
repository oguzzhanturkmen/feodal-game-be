package com.feodals.feodalsgamebe.services;

import com.feodals.feodalsgamebe.entities.Resource;
import com.feodals.feodalsgamebe.repositories.ResourceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;


@Service
public class ResourceService {

    private final ResourceRepository resourceRepository;

    @Autowired
    public ResourceService(ResourceRepository resourceRepository) {
        this.resourceRepository = resourceRepository;
    }

    public Resource addResource(Resource resource) {
        return resourceRepository.save(resource);
    }

    public Optional<Resource> getResourceById(Long id) {
        return resourceRepository.findById(id);
    }

    public List<Resource> getAllResources() {
        return resourceRepository.findAll();
    }

    public Resource updateResource(Resource resource) {
        return resourceRepository.save(resource);
    }

    public void deleteResource(Long id) {
        resourceRepository.deleteById(id);
    }
}
