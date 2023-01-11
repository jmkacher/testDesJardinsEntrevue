package com.example.entrevueSpringBoot.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entrevueSpringBoot.dtos.FilmDtoIn;
import com.example.entrevueSpringBoot.dtos.FilmDtoOut;
import com.example.entrevueSpringBoot.entites.Film;
import com.example.entrevueSpringBoot.entites.FilmRepository;
import com.example.entrevueSpringBoot.mappers.FilmsMapper;



@Service
public class FilmServiceImpls implements FilmService{
 

	@Autowired
	private FilmRepository filmRepo;
	

	@Autowired
	private FilmsMapper filmMapper;


	@Override
	public Optional<Film> recupererFilmoparId(Long identifiant) {
		return null;
	
	}

	@Override
	public FilmDtoOut ajouterFilm(FilmDtoIn filnIn) {
	
	    Film film = filmRepo.save(filmMapper.getEntityFromModel(filnIn));
		
		return filmMapper.getModelFromEntity(film) ;
	}


}
