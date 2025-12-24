package aciccone.demo.payloads;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public record ComuneRequestDTO(
        @NotBlank(message="Il nome del comune è obbligatorio")
        String nome,
        @Email(message="L'email del comune non è valida")
        @NotBlank(message="L'email del comune è obbloigatoria")
        String email
) {
}
