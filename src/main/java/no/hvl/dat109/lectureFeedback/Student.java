package no.hvl.dat109.lectureFeedback;

public class Student {

	private int id;
	private String navn;
	private String passordHash;
	
	public Student() {	
	}
	
	public Student(int id, String navn, String passord) {
		this.setId(id);
		this.setNavn(navn);
		this.setPassordHash(passord);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNavn() {
		return navn;
	}

	public void setNavn(String navn) {
		this.navn = navn;
	}

	public String getPassordHash() {
		return passordHash;
	}

	public void setPassordHash(String passordHash) {
		this.passordHash = passordHash;
	}
	
}
