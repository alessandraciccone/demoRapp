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
    @Column(nullable = false)
    private String email;
    private Set<RapportoIntervento> rapporti;

    public Comune(){};
    public Comune(Long id, String nome, String email, Set<RapportoIntervento> rapporti) {

        this.nome = nome;
        this.email=email;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
