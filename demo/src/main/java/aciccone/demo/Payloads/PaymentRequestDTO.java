package aciccone.demo.Payloads;

public record PaymentRequestDTO(
        double amount,
        String method
) {
}
