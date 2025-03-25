package no.hvl.dat109.lectureFeedback;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TilbakemeldingRepository extends JpaRepository<Tilbakemelding, Long> {
    List<Tilbakemelding> findByForelesningsID(Forelesning forelesning);
}
