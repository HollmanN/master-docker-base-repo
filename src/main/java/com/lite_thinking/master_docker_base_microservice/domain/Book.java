package com.lite_thinking.master_docker_base_microservice.domain;

import java.util.UUID;

public record Book(UUID id, String ISBN, String title, String author, String description) {
}
