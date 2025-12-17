package aciccone.demo.Payloads;

import java.time.LocalDate;

public record RapportoRequestDTO(
        String comuneNome,
        LocalDate data,
        String  tipoDocumento,
        String documentoPath,
        String firmaPath

) {
}
