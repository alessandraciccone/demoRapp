package aciccone.demo.payloads;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

import java.time.LocalDate;

public record PaymentReqeustDTO(
        Long userId,

        @NotNull(message="Importo obbligatorio")
        @Positive(message="L'importo deve essere positivo")
        Double amount,
        @NotNull(message="Metodo di pagamento obbligatorio")
        String method,
        String status,
        LocalDate paymentData
) {
}
