package aciccone.demo.Payloads;

import java.time.LocalDate;
import java.time.LocalDateTime;

public record RapportoResponseDTO(
        Long id,
        String comuneNome,
        LocalDate data,
        String tipoDocumento,
        String documentoPath,
        String firmaPath,
        LocalDateTime timestamp
) {
}
