package com.example.filerouge.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Enseignant implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -2389751624258575509L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nom;
	private String prenom;

	@OneToMany(mappedBy = "enseignant", fetch=FetchType.LAZY)
	@JsonIgnore
	private List<Formation> formation = new ArrayList<>();

	@ManyToOne
	@JsonIgnore
	private Session session;

	@OneToMany(mappedBy = "enseignant")
	@JsonIgnore
	private List<Evaluation> evaluations = new ArrayList<>();

	public Enseignant() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Enseignant(String nom, String prenom) {
		super();
		this.nom = nom;
		this.prenom = prenom;
	}

	public List<Evaluation> getEvaluations() {
		return evaluations;
	}

	public void setEvaluations(List<Evaluation> evaluations) {
		this.evaluations = evaluations;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public List<Formation> getFormation() {
		return formation;
	}

	public void setFormation(List<Formation> formation) {
		this.formation = formation;
	}

	public Session getSession() {
		return session;
	}

	public void setSession(Session session) {
		this.session = session;
	}

}
