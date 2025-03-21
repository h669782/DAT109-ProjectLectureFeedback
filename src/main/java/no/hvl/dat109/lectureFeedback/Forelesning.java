package no.hvl.dat109.lectureFeedback;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Forelesning {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String navn;
    private String sted;
    private String tidspunkt;

    @ManyToOne
    @JoinColumn(name = "admin_id", nullable = false)  
    private Admin admin; 

    @OneToMany(mappedBy = "forelesning", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Registrering> registreringer;

    public Forelesning() {
    }

    public Forelesning(Long id, String navn, String tidspunkt, String sted, Admin admin) { 
        this.setId(id);
        this.setNavn(navn);
        this.setTidspunkt(tidspunkt);
        this.setSted(sted);
        this.setAdmin(admin); 
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNavn() { return navn; }
    public void setNavn(String navn) { this.navn = navn; }

    public String getTidspunkt() { return tidspunkt; }
    public void setTidspunkt(String tidspunkt) { this.tidspunkt = tidspunkt; }

    public String getSted() { return sted; }
    public void setSted(String sted) { this.sted = sted; }

    public Admin getAdmin() { return admin; }
    public void setAdmin(Admin admin) { this.admin = admin; } 
}

