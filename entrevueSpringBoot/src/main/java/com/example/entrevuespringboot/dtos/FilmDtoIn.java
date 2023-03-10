package com.example.entrevuespringboot.dtos;

import java.util.Set;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FilmDtoIn {

	@JsonProperty
	private String titre;

	@JsonProperty
	private String description;

	@JsonProperty

	private Set<ActeurDtoIn> acteurs;
	
}
