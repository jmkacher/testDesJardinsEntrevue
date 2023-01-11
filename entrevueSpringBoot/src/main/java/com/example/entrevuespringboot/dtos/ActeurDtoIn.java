package com.example.entrevuespringboot.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
/**
 * @author MAISON
 *
 */
@Data
@NoArgsConstructor
@AllArgsConstructor

public class ActeurDtoIn {

	@JsonProperty("nom")
	private String nom;

	@JsonProperty("prenom")
	private String prenom;
}
