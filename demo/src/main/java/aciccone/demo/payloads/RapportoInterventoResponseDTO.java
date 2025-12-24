package aciccone.demo.payloads;

import aciccone.demo.entities.TipoDocumento;

import java.time.LocalDate;
import java.time.LocalDateTime;

public record RapportoInterventoResponseDTO(
        Long id,
        String nomeUtente,
        String nomeComune,
        String emailComune,
        String oggetto,
        LocalDate data,
        Double importo,
        TipoDocumento tipoDocumento,
        String documentoPath,
        String firmaPath,
        LocalDateTime timestamp
) {
}
