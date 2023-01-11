package com.example.entrevuespringboot.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entrevuespringboot.dtos.FilmDtoIn;
import com.example.entrevuespringboot.dtos.FilmDtoOut;
import com.example.entrevuespringboot.entites.Film;
import com.example.entrevuespringboot.entites.FilmRepository;
import com.example.entrevuespringboot.mappers.FilmsMapper;


/**
 * @author MAISON
 *
 */
@Service
public class FilmServiceImpls implements FilmService {

	@Autowired
	private FilmRepository filmRepo;

	@Autowired
	private FilmsMapper filmMapper;

	@Override
	public FilmDtoOut recupererFilmoparId(Long identifiant) {

		return filmMapper.getModelFromEntity(filmRepo.findById(identifiant).orElseThrow()) ;
	}

	@Override
	public FilmDtoOut ajouterFilm(FilmDtoIn filnIn) {

		Film film = filmRepo.save(filmMapper.getEntityFromModel(filnIn));

		return filmMapper.getModelFromEntity(film);
	}

}
