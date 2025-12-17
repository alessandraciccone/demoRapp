package aciccone.demo.Payloads;

public record LoginResponseDto(
        String token,
        String role
) {
}
