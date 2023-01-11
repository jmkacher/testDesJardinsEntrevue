package com.example.entrevueSpringBoot.dtos;

import java.util.Set;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class FilmDtoOut {
	
	@JsonProperty
	private String id;

	@JsonProperty
	private String titre;

	@JsonProperty
	private String description;

	@JsonProperty
	private Set<ActeurDtoOut> acteurs;

}
