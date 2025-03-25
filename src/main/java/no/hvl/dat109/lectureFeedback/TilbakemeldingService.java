package no.hvl.dat109.lectureFeedback;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TilbakemeldingService {

    @Autowired
    private TilbakemeldingRepository tilbakemeldingRepo;

    public void lagreTilbakemelding(Farge farge, Forelesning forelesning) {
        Tilbakemelding t = new Tilbakemelding();
        t.setFarge(farge);
        t.setForelesningsID(forelesning);
        tilbakemeldingRepo.save(t);
    }

    public List<Tilbakemelding> hentTilbakemeldingerForForelesning(Forelesning forelesning) {
        return tilbakemeldingRepo.findByForelesningsID(forelesning);
    }
}

