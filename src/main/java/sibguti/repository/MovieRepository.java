package sibguti.repository;

import org.springframework.data.repository.CrudRepository;
import java.util.List;
import sibguti.entity.Movie;


public interface MovieRepository extends CrudRepository<Movie, Integer> {
	List<Movie> getByYearASC();
	List<Movie> getByTitleASC();
	List<Movie> getByRatingASC();
	List<Movie> getByIdDESC();
}