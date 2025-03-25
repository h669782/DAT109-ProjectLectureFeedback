package no.hvl.dat109.lectureFeedback;

import java.util.List;

import jakarta.persistence.Embedded;
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
	private String studnr;
	@Embedded
	private Passord passord;
	
    @OneToMany(mappedBy = "student")
    private List<Registrering> registreringer;
	
	public Student() {	
	}
	
	public Student(Long id, String studnr, Passord passord) {
		this.id = id;
		this.studnr = studnr;
		this.passord = passord;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getStudnr() {
		return studnr;
	}

	public void setStudnr(String studnr) {
		this.studnr = studnr;
	}

	public Passord getPassord() {
		return passord;
	}

	public void setPassord(Passord passord) {
		this.passord = passord;
	}
	
}
