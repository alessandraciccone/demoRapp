package aciccone.demo.payloads;

import java.time.LocalDate;

public record PaymentResponseDTO(
        Long id,
        Long userId,
        String userName,
        Double amount,
        String method,
        String status,
        LocalDate paymentData
) {
}
