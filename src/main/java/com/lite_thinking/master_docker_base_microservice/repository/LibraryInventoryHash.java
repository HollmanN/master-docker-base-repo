package com.lite_thinking.master_docker_base_microservice.repository;

import com.lite_thinking.master_docker_base_microservice.domain.Book;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

import java.util.UUID;

@RedisHash
public class LibraryInventoryHash {
    @Id
    private UUID id;
    private Book book;

    public LibraryInventoryHash(Book book) {
        this.id = book.id();
        this.book = book;
    }

    public UUID getId() {
        return id;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }
}
