package com.example.entrevuespringboot.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ActeurDtoOut {
	
	@JsonProperty("id")
	private String id;

	@JsonProperty("nom")
	private String nom;

	@JsonProperty("prenom")
	private String prenom;

}
