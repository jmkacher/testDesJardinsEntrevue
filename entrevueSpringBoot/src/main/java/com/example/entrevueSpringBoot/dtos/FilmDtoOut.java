package com.example.entrevueSpringBoot.dtos;

import java.util.Set;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FilmDtoOut {
	
	@JsonProperty
	private Long id;

	@JsonProperty
	private String titre;

	@JsonProperty
	private String description;

	@JsonProperty
	private Set<ActeurDtoOut> acteurs;

}
