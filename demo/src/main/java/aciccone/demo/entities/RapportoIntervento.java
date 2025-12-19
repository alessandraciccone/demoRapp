package aciccone.demo.entities;

import aciccone.demo.entities.Comune;
import aciccone.demo.entities.TipoDocumento;
import aciccone.demo.entities.User;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "rapporti")
public class RapportoIntervento{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(optional = false)
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne(optional = false)
    @JoinColumn(name = "comune_id")
    private Comune comune;

    // ---- DATI COMUNI ----
    @Column(nullable = false)
    private String oggetto;

    @Column(nullable = false)
    private LocalDate data;

    @Column(nullable = false)
    private Double importo;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private TipoDocumento tipoDocumento; // MANUALE, PDF, IMAGE

    private String documentoPath; // pdf / jpg / png
    private String firmaPath;

    @Column(nullable = false)
    private LocalDateTime timestamp;

    public RapportoIntervento() {}

    public RapportoIntervento(Long id, User user, Comune comune, String oggetto, LocalDate data, Double importo, TipoDocumento tipoDocumento, String documentoPath, String firmaPath, LocalDateTime timestamp) {
        this.id = id;
        this.user = user;
        this.comune = comune;
        this.oggetto = oggetto;
        this.data = data;
        this.importo = importo;
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

    public String getOggetto() {
        return oggetto;
    }

    public void setOggetto(String oggetto) {
        this.oggetto = oggetto;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public Double getImporto() {
        return importo;
    }

    public void setImporto(Double importo) {
        this.importo = importo;
    }

    public TipoDocumento getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(TipoDocumento tipoDocumento) {
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
                "id=" + id +

                ", oggetto='" + oggetto + '\'' +
                ", data=" + data +
                ", importo=" + importo +
                ", tipoDocumento=" + tipoDocumento +
                ", documentoPath='" + documentoPath + '\'' +
                ", firmaPath='" + firmaPath + '\'' +
                ", timestamp=" + timestamp +
                '}';
    }
}
