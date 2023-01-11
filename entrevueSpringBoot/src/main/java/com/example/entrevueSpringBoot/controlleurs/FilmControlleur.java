package com.example.entrevueSpringBoot.controlleurs;

import java.util.HashSet;
import java.util.Set;

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

import com.example.entrevueSpringBoot.dtos.FilmDtoIn;
import com.example.entrevueSpringBoot.dtos.FilmDtoOut;
import com.example.entrevueSpringBoot.services.FilmService;

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

			logger.info("######film cree#### \n" + out.toString());

			return new ResponseEntity<Object>(out, HttpStatus.CREATED);
		} catch (RuntimeException e) {
			logger.error("###### erreur ####", e);
			return new ResponseEntity<Object>(null, HttpStatus.BAD_REQUEST);

		}

	}

	@GetMapping(path ="/{Id}")
	public ResponseEntity<Object> recupererInfoFilm(@PathVariable Long Id) {
		
		try {
			FilmDtoOut out = filmservices.recupererFilmoparId(Id);

			logger.info("######film Trouvee avec id : " + Id +"#### \n" + out.toString());

			return new ResponseEntity<Object>(out, HttpStatus.OK);
		} 
		catch ( java.util.NoSuchElementException e) {
			logger.info("######film avec identifiant : " + Id + " n existe pas en base#### \n", e);
			return new ResponseEntity<Object>("film  avec id : "+ Id +" n existe pas " , HttpStatus.NOT_FOUND);

		}
		catch (RuntimeException e) {
			logger.error("###### erreur tech ####", e);
			return new ResponseEntity<Object>(null, HttpStatus.BAD_REQUEST);

		}
		
	}
	
		
}
