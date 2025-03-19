package no.hvl.dat109.lectureFeedback;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String navn;
	private Passord passord;
	
    @OneToMany(mappedBy = "student")
    private List<Registrering> registreringer;
	
	public Student() {	
	}
	
	public Student(Long id, String navn, Passord passord) {
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

	public Passord getPassord() {
		return passord;
	}

	public void setPassord(Passord passord) {
		this.passord = passord;
	}
	
}
