package sibguti.repository;

import org.springframework.data.repository.CrudRepository;
import sibguti.entity.Movie;

public interface MovieRepository extends CrudRepository<Movie, Integer> {

}