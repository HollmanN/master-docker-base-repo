package com.lite_thinking.master_docker_base_microservice.service;

import com.lite_thinking.master_docker_base_microservice.domain.Book;
import com.lite_thinking.master_docker_base_microservice.repository.LibraryInventoryHash;
import com.lite_thinking.master_docker_base_microservice.repository.LibraryInventoryRedisRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class LibraryInventoryService {

    LibraryInventoryRedisRepository repository;

    public LibraryInventoryService(LibraryInventoryRedisRepository repository) {
        this.repository = repository;
    }

    @PostConstruct
    public void start(){
        Book book = new Book(UUID.randomUUID(),"1234456", "Test", "Lite Thinking", "Test Book");
        repository.save(new LibraryInventoryHash(book));
    }

    public Iterable<LibraryInventoryHash> getBooks(){
        Iterable<LibraryInventoryHash> books = repository.findAll();
        return books;
    }
}
