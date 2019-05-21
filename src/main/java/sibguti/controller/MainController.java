package sibguti.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import sibguti.entity.Movie;
import sibguti.repository.MovieRepository;

@Controller
public class MainController implements WebMvcConfigurer {
	@Autowired
	private MovieRepository movieRepository;

	@GetMapping(path="/")
	public String home() {
		return "index";
	}

	@GetMapping(path="/add")
	public @ResponseBody String addMovie (@RequestParam String 	title, 
										@RequestParam String 		movieYear,
										@RequestParam String 	movieRated,
										@RequestParam String 	movieReleaseDate,
										@RequestParam String 	movieRuntime,
										@RequestParam String 	movieGenre,
										@RequestParam String 	movieDirector,
										@RequestParam String 	movieActors,
										@RequestParam String 	description,
										@RequestParam String 	movieCountry,
										@RequestParam String 	moviePosterURL,
										@RequestParam double 	movieImdbRating,
										@RequestParam String 	movieWebsite,
										@RequestParam String 	imdbID) {
		Movie movie = new Movie();
		movie.setTitle(title);
		movie.setMovieYear(movieYear);
		movie.setMovieRated(movieRated);
		movie.setMovieReleaseDate(movieReleaseDate);
		movie.setMovieRuntime(movieRuntime);
		movie.setMovieGenre(movieGenre);
		movie.setMovieDirector(movieDirector);
		movie.setMovieActors(movieActors);
		movie.setDescription(description);
		movie.setMovieCountry(movieCountry);
		movie.setMoviePosterURL(moviePosterURL);
		movie.setMovieImdbRating(movieImdbRating);
		movie.setMovieWebsite(movieWebsite);
		movie.setImdbID(imdbID);
		movieRepository.save(movie);

		return "Saved to Database";
	}

	@GetMapping(path="/all")
	public @ResponseBody Iterable<Movie> getAllMovies() {
		return movieRepository.getByIdDESC();
	}


}