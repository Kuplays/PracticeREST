package sibguti.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import sibguti.entity.Movie;
import sibguti.repository.MovieRepository;

@Controller
@RequestMapping(path="/test")
public class MainController {
	@Autowired
	private MovieRepository movieRepository;

	@GetMapping(path="/add")
	public @ResponseBody String addMovie (@RequestParam String title, @RequestParam String description) {
		Movie movie = new Movie();
		movie.setTitle(title);
		movie.setDescription(description);
		movieRepository.save(movie);
		return "Saved";
	}

	@GetMapping(path="/all")
	public @ResponseBody Iterable<Movie> getAllMovies() {
		return movieRepository.findAll();
	}
}