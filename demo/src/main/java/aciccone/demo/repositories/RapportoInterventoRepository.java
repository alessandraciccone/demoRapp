package aciccone.demo.repositories;

import aciccone.demo.entities.RapportoIntervento;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface RapportoInterventoRepository extends JpaRepository<RapportoIntervento, Long> {
    List<RapportoIntervento> findByComune_Nome(String nomeComune);

    List<RapportoIntervento> findByComune_NomeAndData(
            String nomeComune,
            LocalDate data
    );
}
