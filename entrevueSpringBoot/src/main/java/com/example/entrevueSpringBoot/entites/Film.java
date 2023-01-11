package com.example.entrevueSpringBoot.entites;


import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author MAISON
 *
 */

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "films")
public class Film {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_film")
	private Long identifiant ;
	
	private String titre ;
	
	private String description ;
	
	@ManyToMany(cascade = { CascadeType.ALL } )
	@JoinTable(name = "acteurs_films", joinColumns = { @JoinColumn(name = "id_acteur") }, inverseJoinColumns = {
			@JoinColumn(name = "id_film") })
	private Set<Acteur> acteurs ;
	

}
