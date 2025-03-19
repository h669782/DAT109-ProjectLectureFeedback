package no.hvl.dat109.lectureFeedback;

public class Forelesning {
	
	private int id;
	private String navn;
	private String tidspunkt;
	private String sted;
	private Admin adminID;
	
	public Forelesning() {
	}
	
	public Forelesning(int id, String navn, String tidspunkt, String sted, Admin adminID) {
		this.setId(id);
		this.setNavn(navn);
		this.setTidspunkt(tidspunkt);
		this.setSted(sted);
		this.setAdminID(adminID);
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

	public String getTidspunkt() {
		return tidspunkt;
	}

	public void setTidspunkt(String tidspunkt) {
		this.tidspunkt = tidspunkt;
	}

	public String getSted() {
		return sted;
	}

	public void setSted(String sted) {
		this.sted = sted;
	}

	public Admin getAdminID() {
		return adminID;
	}

	public void setAdminID(Admin adminID) {
		this.adminID = adminID;
	}

}
