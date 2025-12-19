package aciccone.demo.repositories;

import aciccone.demo.entities.Comune;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ComuneRepository  extends JpaRepository<Comune,Long> {
    Optional<Comune> findByNome(String nome);
    Optional<Comune> findByEmail(String email);
}
