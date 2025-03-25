package no.hvl.dat109.lectureFeedback;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ForelesningRepository extends JpaRepository<Forelesning, Long> {
}
