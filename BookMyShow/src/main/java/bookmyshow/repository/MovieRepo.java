package bookmyshow.repository;

import bookmyshow.model.Movie;
import org.hibernate.boot.models.JpaAnnotations;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MovieRepo extends JpaRepository<Movie, Long> {


    List<Movie> findBylanguage(String language);

    List<Movie> findByTitleContaining(String title);

    List<Movie> findByGenre(String genre);

}
