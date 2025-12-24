package aciccone.demo.payloads;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record UserRegisterRequestDTO(

@NotBlank(message="Il nome è obbligatorio")
String name,

@Email(message="L'email deve essere valida")
@NotBlank( message="L'email è obbligatoria")
String email,

@NotBlank(message="La password è obbligatoria")
@Size(min=6, message="La password deve avere minimo sei caratteri")

String password

) {}
