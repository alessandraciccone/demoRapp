package aciccone.demo.payloads;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public record UserLoginRequestDTO(
        @Email
        @NotBlank
        String email,

        @NotBlank
        String password
) {
}
