package no.hvl.dat109.lectureFeedback;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
public class Tilbakemelding {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private Farge farge;

    @ManyToOne
    @JoinColumn(name = "forelesning_id", nullable = false)
    private Forelesning forelesningsID;

	
	public Tilbakemelding() {
	}

	public Tilbakemelding(Long id, Farge farge, Forelesning forelesningsID) {
		this.id = id;
		this.farge = farge;
		this.forelesningsID = forelesningsID;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
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
