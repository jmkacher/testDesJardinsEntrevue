package com.example.entrevuespringboot.entites;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author MAISON
 *
 */
@Data
@NoArgsConstructor
@Entity
@Table(name = "acteurs")

public class Acteur {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_acteur")
	private Long identifiant ;
	
	private String nom ;
	
	private String prenom ;
	
	@ManyToMany(mappedBy = "acteurs")

	private Set<Film> films ;


}
