package no.hvl.dat109.lectureFeedback;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegistreringService {

    @Autowired
    private RegistreringRepository registreringRepo;

    public boolean harAlleredeRegistrert(Student student, Forelesning forelesning) {
        return registreringRepo.existsByStudentAndForelesning(student, forelesning);
    }

    public boolean registrerTilbakemelding(Student student, Forelesning forelesning) {
        if (harAlleredeRegistrert(student, forelesning)) {
            return false;
        }

        Registrering r = new Registrering();
        r.setStudent(student);
        r.setForelesning(forelesning);
        registreringRepo.save(r);
        return true;
    }
}
