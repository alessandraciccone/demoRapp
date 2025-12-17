package aciccone.demo.Payloads;

public record RegisterRequestDTO(
        String name,
        String email,
        String password
) {
}
