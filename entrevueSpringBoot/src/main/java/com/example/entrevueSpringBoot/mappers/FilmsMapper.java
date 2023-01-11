package com.example.entrevueSpringBoot.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.example.entrevueSpringBoot.dtos.ActeurDtoOut;
import com.example.entrevueSpringBoot.dtos.FilmDtoIn;
import com.example.entrevueSpringBoot.dtos.FilmDtoOut;
import com.example.entrevueSpringBoot.entites.Acteur;
import com.example.entrevueSpringBoot.entites.Film;

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