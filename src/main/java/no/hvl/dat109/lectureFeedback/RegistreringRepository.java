package no.hvl.dat109.lectureFeedback;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RegistreringRepository extends JpaRepository<Registrering, Long> {
	
    boolean existsByStudentAndForelesning(Student student, Forelesning forelesning);

}
