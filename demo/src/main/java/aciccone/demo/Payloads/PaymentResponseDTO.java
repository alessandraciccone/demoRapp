package aciccone.demo.Payloads;

import java.time.LocalDate;

public record PaymentResponseDTO(
        double amount,
        String status,
        LocalDate paymentDate
) {
}
