package no.hvl.dat109.lectureFeedback;

public class Registrering {

	private int id;
	private Student studentID;
	private Forelesning forelesningsID;
	
	public Registrering(){
	}
	
	public Registrering(int id, Student studentID, Forelesning forelesningsID) {
		this.setId(id);
		this.setStudentID(studentID);
		this.setForelesningsID(forelesningsID);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Student getStudentID() {
		return studentID;
	}

	public void setStudentID(Student studentID) {
		this.studentID = studentID;
	}

	public Forelesning getForelesningsID() {
		return forelesningsID;
	}

	public void setForelesningsID(Forelesning forelesningsID) {
		this.forelesningsID = forelesningsID;
	}
	
}
