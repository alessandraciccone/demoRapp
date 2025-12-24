package aciccone.demo.payloads;

import aciccone.demo.entities.TipoDocumento;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;

public record RapportoInterventoRequestDTO(
Long userId,
Long comuneId,

@NotBlank(message="Oggetto obbligatorio")
String oggetto,

@NotNull(message="Data obbligatoria")
LocalDate data,

@NotNull(message="Importo obbligatorio")
Double importo,

@NotNull(message="Il tipo di documento è obbligatorio")
TipoDocumento tipoDocumento,

String documentoPath,
String firmaPath
)
{}
