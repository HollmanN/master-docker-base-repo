package com.lite_thinking.master_docker_base_microservice.controller;

import com.lite_thinking.master_docker_base_microservice.repository.LibraryInventoryHash;
import com.lite_thinking.master_docker_base_microservice.service.LibraryInventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LibraryInventoryController {

    private final LibraryInventoryService libraryInventoryService;

    @Autowired
    public LibraryInventoryController(LibraryInventoryService libraryInventoryService) {
        this.libraryInventoryService = libraryInventoryService;
    }

    @GetMapping("/books")
    public Iterable<LibraryInventoryHash> getBooks(){
        return libraryInventoryService.getBooks();
    }
}
