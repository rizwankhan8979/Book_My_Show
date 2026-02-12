package bookmyshow.repository;

import bookmyshow.model.Show;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ShowRepo extends JpaRepository<Show, Long> {

    List<Show> findByMovieId(Long MovieId);

    List<Show> findBy
}
