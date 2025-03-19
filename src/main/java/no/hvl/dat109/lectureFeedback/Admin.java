package no.hvl.dat109.lectureFeedback;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Admin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String navn;
    private String passord;

    @OneToMany(mappedBy = "admin", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Forelesning> opprettedeForelesninger; 
	
	public Admin(Long id, String navn, String passord) {
		this.setId(id);
		this.setNavn(navn);
		this.setPassord(passord);
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNavn() {
		return navn;
	}

	public void setNavn(String navn) {
		this.navn = navn;
	}

	public String getPassord() {
		return passord;
	}

	public void setPassord(String passord) {
		this.passord = passord;
	}

}
