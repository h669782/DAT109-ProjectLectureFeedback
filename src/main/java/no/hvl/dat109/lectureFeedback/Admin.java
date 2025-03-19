package no.hvl.dat109.lectureFeedback;

public class Admin {
	
	private int id;
	private String navn;
	private String passord;
	
	public Admin(int id, String navn, String passord) {
		this.setId(id);
		this.setNavn(navn);
		this.setPassord(passord);
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

	public String getPassord() {
		return passord;
	}

	public void setPassord(String passord) {
		this.passord = passord;
	}

}
