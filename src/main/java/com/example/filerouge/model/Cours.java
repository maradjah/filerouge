package com.example.filerouge.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Cours implements Serializable{

	private static final long serialVersionUID = -6551367606721664979L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nom;
	private String url;
	
	@ManyToOne
	private Formation formation;	
	
	@OneToMany(mappedBy = "cours")
	@JsonIgnore
	private List<Exercice> exercices = new ArrayList<>();
	
	public Cours() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cours(String nom, String url) {
		super();
		this.nom = nom;
		this.url = url;
	}


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Formation getFormation() {
		return formation;
	}

	public void setFormation(Formation formation) {
		this.formation = formation;
	}
	public List<Exercice> getExercices() {
		return exercices;
	}

	public void setExercices(List<Exercice> exercices) {
		this.exercices = exercices;
	}

	@Override
	public String toString() {
		return "Cours [id=" + id + ", nom=" + nom + "]";
	}
	
	

}
