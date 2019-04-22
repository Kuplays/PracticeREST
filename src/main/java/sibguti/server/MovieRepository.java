package sibguti.server;

import org.springframework.data.repository.CrudRepository;
import sibguti.server.Movie;

public interface MovieRepository extends CrudRepository<Movie, Integer> {

}