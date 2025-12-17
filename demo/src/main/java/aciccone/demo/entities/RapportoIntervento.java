package aciccone.demo.entities;


import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name="rapporti")
public class RapportoIntervento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

            private Long id;


    @ManyToOne
    @JoinColumn(name="user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name="comune_id")
    private Comune comune;

    private LocalDate data;
    private String tipoDocumento;//foto, pdf o manuale
    private String documentoPath; //url o path del file;
    private String firmaPath; // path o url firma digiale

    private LocalDateTime timestamp;


    public RapportoIntervento(){};
    public RapportoIntervento(Long id, User user, Comune comune, LocalDate data, String tipoDocumento, String documentoPath, String firmaPath, LocalDateTime timestamp) {
        this.user = user;
        this.comune = comune;
        this.data = data;
        this.tipoDocumento = tipoDocumento;
        this.documentoPath = documentoPath;
        this.firmaPath = firmaPath;
        this.timestamp = timestamp;
    }


    public Long getId() {
        return id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Comune getComune() {
        return comune;
    }

    public void setComune(Comune comune) {
        this.comune = comune;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getDocumentoPath() {
        return documentoPath;
    }

    public void setDocumentoPath(String documentoPath) {
        this.documentoPath = documentoPath;
    }

    public String getFirmaPath() {
        return firmaPath;
    }

    public void setFirmaPath(String firmaPath) {
        this.firmaPath = firmaPath;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        return "RapportoIntervento{" +
                "Id=" + id +
                ", user=" + user +
                ", comune=" + comune +
                ", data=" + data +
                ", tipoDocumento='" + tipoDocumento + '\'' +
                ", documentoPath='" + documentoPath + '\'' +
                ", firmaPath='" + firmaPath + '\'' +
                ", timestamp=" + timestamp +
                '}';
    }
}
