package com.projeto.crud_spring.domain.user;

public record LoginResponseDTO(String token, UserRole role, String login) {
}
