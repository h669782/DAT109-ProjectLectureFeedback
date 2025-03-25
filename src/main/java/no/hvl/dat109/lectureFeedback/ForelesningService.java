package no.hvl.dat109.lectureFeedback;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ForelesningService {

    @Autowired
    private ForelesningRepository forelesningRepo;

    public List<Forelesning> hentAlleForelesninger() {
        return forelesningRepo.findAll();
    }

    public Optional<Forelesning> finnForelesningMedId(Long id) {
        return forelesningRepo.findById(id);
    }

    public Forelesning lagre(Forelesning f) {
        return forelesningRepo.save(f);
    }

    public void slett(Long id) {
        forelesningRepo.deleteById(id);
    }
}
