package aciccone.demo.entities;


import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name="comuni")
public class Comune {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String nome;
    @OneToMany(mappedBy = "comune")
    private Set<RapportoIntervento> rapporti;

    public Comune(){};
    public Comune(Long id, String nome, Set<RapportoIntervento> rapporti) {

        this.nome = nome;
        this.rapporti = rapporti;
    }


    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<RapportoIntervento> getRapporti() {
        return rapporti;
    }

    public void setRapporti(Set<RapportoIntervento> rapporti) {
        this.rapporti = rapporti;
    }

    @Override
    public String toString() {
        return "Comune{" +
                "Id=" + id +
                ", nome='" + nome + '\'' +
                '}';
    }
}
