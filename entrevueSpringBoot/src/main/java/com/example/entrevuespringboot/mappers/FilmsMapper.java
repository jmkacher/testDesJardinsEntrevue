package com.example.entrevuespringboot.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.example.entrevuespringboot.entites.Acteur;
import com.example.entrevuespringboot.entites.Film;
import com.example.entrevuespringboot.dtos.ActeurDtoOut;
import com.example.entrevuespringboot.dtos.FilmDtoIn;
import com.example.entrevuespringboot.dtos.FilmDtoOut;

@Mapper(componentModel = "spring")
public interface FilmsMapper {

	 @Mapping(target = "id", 
		      expression = "java(getIdFromEntity(film.getIdentifiant()))" )
	FilmDtoOut  getModelFromEntity (Film film) ;
	
	Film getEntityFromModel (FilmDtoIn film) ;
	
	 @Mapping(target = "id", 
		      expression = "java(getIdFromEntity(acteur.getIdentifiant()))" )
	ActeurDtoOut   getModelFromEntity (Acteur acteur) ;
	
	default String getIdFromEntity(Long identifiant) {
	     
	      return String.valueOf(identifiant);
	      
}
}