package com.example.entrevuespringboot.web;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entrevuespringboot.dtos.FilmDtoIn;
import com.example.entrevuespringboot.dtos.FilmDtoOut;
import com.example.entrevuespringboot.services.FilmService;

/**
 * @author MAISON
 *
 */
@RestController
@RequestMapping(value = "/api/film")

public class FilmControlleur {

	@Autowired
	private FilmService filmservices;

	private static final Logger logger = LoggerFactory.getLogger(FilmControlleur.class);

	@PostMapping
	public ResponseEntity<Object> ajouterFilm(@RequestBody FilmDtoIn fin) {
		try {
			FilmDtoOut out = filmservices.ajouterFilm(fin);

			logger.info("film cree :{}" ,out);

			return new ResponseEntity<>(out, HttpStatus.CREATED);
		} catch (RuntimeException e) {
			logger.error("###### erreur ####", e);
			return new ResponseEntity<>(new Object(), HttpStatus.BAD_REQUEST);

		}

	}

	@GetMapping(path ="/{id}")
	public ResponseEntity<Object> recupererInfoFilm(@PathVariable Long id) {
		
		try {
			FilmDtoOut out = filmservices.recupererFilmoparId(id);

			logger.info("######film Trouvee :{}" , out);

			return new ResponseEntity<>(out, HttpStatus.OK);
		} 
		catch ( java.util.NoSuchElementException e) {
			logger.info("######film avec identifiant : " + id + " n existe pas en base#### \n", e);
			return new ResponseEntity<>("film  avec id : "+ id +" n existe pas " , HttpStatus.NOT_FOUND);

		}
		catch (RuntimeException e) {
			logger.error("###### erreur tech ####", e);
			return new ResponseEntity<>( HttpStatus.BAD_REQUEST);

		}
		
	}
	
		
}
