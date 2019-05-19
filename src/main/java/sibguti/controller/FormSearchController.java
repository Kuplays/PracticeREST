package sibguti.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.URL;

import sibguti.forms.FormTitle;
import sibguti.entity.Movie;

@Controller
public class FormSearchController implements WebMvcConfigurer {
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/query").setViewName("search");
    }

    @GetMapping(path="/query")
    public String showForm(FormTitle formTitle) {
        return "search";
    }

    @PostMapping(path="/query")
    public String checkMovieTitle(@Valid FormTitle formTitle, BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            return "search";
        }

        ObjectMapper oMapper = new ObjectMapper();
        Movie movie = null;
        try {
            movie = oMapper.readValue(new URL("http://www.omdbapi.com/?apikey=71dee3d0&t=" + formTitle.getSearchTitle()), Movie.class);
        } catch(IOException ex) {}

        return movie.toString();
        //return "redirect:http://www.omdbapi.com/?apikey=71dee3d0&t=" + mName;
    }
}