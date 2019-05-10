package sibguti.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import sibguti.forms.FormTitle;


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

        return "redirect:http://www.omdbapi.com/?apikey=71dee3d0&t=" + formTitle.getSearchTitle();
    }
}