package com.lite_thinking.master_docker_base_microservice.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface LibraryInventoryRedisRepository extends CrudRepository<LibraryInventoryHash, UUID> {
}
