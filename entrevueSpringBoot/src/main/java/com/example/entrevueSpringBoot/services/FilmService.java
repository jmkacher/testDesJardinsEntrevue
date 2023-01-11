package com.example.entrevueSpringBoot.services;

import java.util.Optional;

import com.example.entrevueSpringBoot.dtos.FilmDtoIn;
import com.example.entrevueSpringBoot.dtos.FilmDtoOut;
import com.example.entrevueSpringBoot.entites.Film;


public interface FilmService {
	
	
	
	public Optional<Film> recupererFilmoparId( Long identifiant ) ;
	
	public FilmDtoOut ajouterFilm(FilmDtoIn filnIn) ;

}
