package no.hvl.dat109.lectureFeedback;

public class Tilbakemelding {
	
	private int id;
	private Farge farge;
	private Forelesning forelesningsID;
	
	public Tilbakemelding() {
	}

	public Tilbakemelding(int id, Farge farge, Forelesning forelesningsID) {
		this.setId(id);
		this.setFarge(farge);
		this.setForelesningsID(forelesningsID);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Farge getFarge() {
		return farge;
	}

	public void setFarge(Farge farge) {
		this.farge = farge;
	}

	public Forelesning getForelesningsID() {
		return forelesningsID;
	}

	public void setForelesningsID(Forelesning forelesningsID) {
		this.forelesningsID = forelesningsID;
	}
	
}
