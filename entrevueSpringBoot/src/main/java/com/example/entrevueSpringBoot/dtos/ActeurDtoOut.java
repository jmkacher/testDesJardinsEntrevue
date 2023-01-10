package com.example.entrevueSpringBoot.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ActeurDtoOut {
	
	@JsonProperty("id")
	private Integer id;

	@JsonProperty("nom")
	private String nom;

	@JsonProperty("prenom")
	private String prenom;

}
