package com.example.filerouge.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@Entity
public class Note implements Serializable{

	private static final long serialVersionUID = 8466152341495242993L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private float valeur;
	
	@ManyToOne
	@JsonIgnoreProperties({"enseignant"})
	private Evaluation evaluation;
	
	@ManyToOne
	@JsonIgnoreProperties({ "email","imageUrl","dateNaissance","cv" })
	private Etudiant etudiant;
	

	public Note() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Note(float valeur) {
		super();
		this.valeur = valeur;
	}

	public float getValeur() {
		return valeur;
	}


	public void setValeur(float valeur) {
		this.valeur = valeur;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public Evaluation getEvaluation() {
		return evaluation;
	}


	public void setEvaluation(Evaluation evaluation) {
		this.evaluation = evaluation;
	}


	public Etudiant getEtudiant() {
		return etudiant;
	}


	public void setEtudiant(Etudiant etudiant) {
		this.etudiant = etudiant;
	}


	@Override
	public String toString() {
		return "Note [id=" + id + ", evaluation=" + evaluation + ", etudiant=" + etudiant + "]";
	}
	
	

}
