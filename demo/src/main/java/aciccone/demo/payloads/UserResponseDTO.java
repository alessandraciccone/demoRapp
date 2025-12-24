package aciccone.demo.payloads;

import aciccone.demo.entities.Role;

public record UserResponseDTO(
        Long id,
        String name,
        String email,
        Role role
) {
}
