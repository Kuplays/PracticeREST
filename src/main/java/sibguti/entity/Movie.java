package sibguti.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSetter;

@JsonIgnoreProperties(ignoreUnknown=true)
@Entity 
public class Movie {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer 	id;
    private String 		title;
    private int 		movieYear;
    private String 		movieRated;
    private String 		movieReleaseDate;
    private String 		movieRuntime;
    private String 		movieGenre;
    private String 		movieDirector;
    private String 		movieActors;
    private String 		description;
    private String 		movieCountry;
    private String 		moviePosterURL;
    private double 		movieImdbRating;
    private String 		movieWebsite;
    private String 		imdbID;

	public Integer getId() {return id;}
	public void setId(Integer id) {this.id = id;}

	public String getTitle() {return this.title;}
	@JsonSetter("Title")
	public void setTitle(String newTitle) {this.title = newTitle;}

	public int getMovieYear() {return movieYear;}
	@JsonSetter("Year")
	public void setMovieYear(int newMovieYear) {this.movieYear = newMovieYear;}

	public String getMovieRated() {return movieRated;}
	@JsonSetter("Rated")
	public void setMovieRated(String newMovieRated) {this.movieRated = newMovieRated;}

	public String getMovieReleaseDate() {return movieReleaseDate;}
	@JsonSetter("Released")
	public void setMovieReleaseDate(String newMovieReleaseDate) {this.movieReleaseDate = newMovieReleaseDate;}

	public String getMovieRuntime() {return movieRuntime;}
	@JsonSetter("Runtime")
	public void setMovieRuntime(String newMovieRuntime) {this.movieRuntime = newMovieRuntime;}

	public String getMovieGenre() {return movieGenre;}
	@JsonSetter("Genre")
	public void setMovieGenre(String newMovieGenre) {this.movieGenre = newMovieGenre;}

	public String getMovieDirector() {return movieDirector;}
	@JsonSetter("Director")
	public void setMovieDirector(String newMovieDirector) {this.movieDirector = newMovieDirector;}

	public String getMovieActors() {return movieActors;}
	@JsonSetter("Actors")
	public void setMovieActors(String newMovieActors) {this.movieActors = newMovieActors;}

	public String getDescription() {return description;}
	@JsonSetter("Plot")
	public void setDescription(String newDescription) {this.description = newDescription;}

	public String getMovieCountry() {return movieCountry;}
	@JsonSetter("Country")
	public void setMovieCountry(String newMovieCountry) {this.movieCountry = newMovieCountry;}

	public String getMoviePosterURL() {return moviePosterURL;}
	@JsonSetter("Poster")
	public void setMoviePosterURL(String newMoviePosterURL) {this.moviePosterURL = newMoviePosterURL;}

	public double getMovieImdbRating() {return movieImdbRating;}
	@JsonSetter("imdbRating")
	public void setMovieImdbRating(double newMovieImdbRating) {this.movieImdbRating = newMovieImdbRating;}

	public String getMovieWebsite() {return movieWebsite;}
	@JsonSetter("Website")
	public void setMovieWebsite(String newMovieWebsite) {this.movieWebsite = newMovieWebsite;}

	public String getImdbID() {return imdbID;}
	@JsonSetter("imdbID")
	public void setImdbID(String newImdbID) {this.imdbID = newImdbID;}

	public String toString() {
		String response = "";
		response += "TITLE: " + this.title;
		response += "\nDESCR: " + this.description;
		response += "\nPoster: " + this.moviePosterURL;
		response += "\nRATING: " + this.movieImdbRating;
		return response;
	}
}