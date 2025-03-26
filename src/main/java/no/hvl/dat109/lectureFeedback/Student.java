package no.hvl.dat109.lectureFeedback;

import java.util.List;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

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
