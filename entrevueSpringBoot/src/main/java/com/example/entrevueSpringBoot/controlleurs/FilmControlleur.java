package com.example.entrevueSpringBoot.controlleurs;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entrevueSpringBoot.dtos.ActeurDtoIn;
import com.example.entrevueSpringBoot.dtos.FilmDtoIn;
import com.example.entrevueSpringBoot.dtos.FilmDtoOut;
import com.example.entrevueSpringBoot.services.FilmService;

@RestController
public class FilmControlleur {
	
	@Autowired
    FilmService filmservices ;
	@RequestMapping("/ajouter")
	public String ajouterFilm ()
	{
		 FilmDtoIn fi = new FilmDtoIn();
		 ActeurDtoIn a1 = new ActeurDtoIn() ;
		 a1.setNom("Jamel") ;
		 a1.setPrenom("Mkacher") ;
		 ActeurDtoIn a2 = new ActeurDtoIn() ;
		 a2.setNom("Jamel1") ;
		 a2.setPrenom("Mkacher1") ;
		 Set<ActeurDtoIn> auteurs = new HashSet<>() ;
		 auteurs.add(a1) ;
		 auteurs.add(a2) ;
		 fi.setDescription("desc") ;
		 fi.setTitre("titre") ;
		 fi.setActeurs(auteurs) ;
		 String s= "" ;
		try
		 {
		FilmDtoOut out = filmservices.ajouterFilm(fi) ;
		System.out.println(out) ;
		s= out.getDescription() ;
		 }
		 catch (Exception e)
		 {
			 System.out.println(e.getStackTrace())  ;
		 }
		
	
		return s ; 
	}
		

}
