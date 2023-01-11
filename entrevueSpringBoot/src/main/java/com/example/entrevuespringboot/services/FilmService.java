package com.example.entrevuespringboot.services;



import com.example.entrevuespringboot.dtos.FilmDtoIn;
import com.example.entrevuespringboot.dtos.FilmDtoOut;


public interface FilmService {
	
	
	
	public FilmDtoOut recupererFilmoparId( Long identifiant ) ;
	
	public FilmDtoOut ajouterFilm(FilmDtoIn filnIn) ;

}