package com.example.entrevueSpringBoot.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ActeurDtoIn {

	@JsonProperty("nom")
	private String nom;

	@JsonProperty("prenom")
	private String prenom;
}
