package no.hvl.dat109.lectureFeedback;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Registrering {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "student_id", nullable = false)
    private Student student; 

    @ManyToOne
    @JoinColumn(name = "forelesning_id", nullable = false)
    private Forelesning forelesning; 

    public Registrering() {
    }

    public Registrering(Long id, Student student, Forelesning forelesning) { 
        this.id = id;
        this.student = student;
        this.forelesning = forelesning;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Forelesning getForelesning() { 
        return forelesning;
    }

    public void setForelesning(Forelesning forelesning) { 
        this.forelesning = forelesning;
    }
}
