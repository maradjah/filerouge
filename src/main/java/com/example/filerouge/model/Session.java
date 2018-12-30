package com.example.filerouge.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
public class Session implements Serializable {

	private static final long serialVersionUID = -8494210906466079633L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nom;

	@OneToMany(mappedBy = "session")
	@JsonIgnoreProperties({ "email","imageUrl","dateNaissance","cv" })
	private List<Etudiant> etudiants = new ArrayList<>();

	@OneToMany(mappedBy = "session")
	private List<Enseignant> enseignants = new ArrayList<>();

	@OneToMany(mappedBy="session")
	private List<Formation> formations = new ArrayList<>();

	@OneToMany(mappedBy = "session")
	private List<Message> messages = new ArrayList<>();
	
	public Session() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Session(String nom) {
		super();
		this.nom = nom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public List<Etudiant> getEtudiants() {
		return etudiants;
	}

	public void setEtudiants(List<Etudiant> etudiants) {
		this.etudiants = etudiants;
	}

	public List<Enseignant> getEnseignant() {
		return enseignants;
	}

	public void setEnseignant(List<Enseignant> enseignant) {
		this.enseignants = enseignant;
	}

	public List<Formation> getFormation() {
		return formations;
	}

	public void setFormation(List<Formation> formations) {
		this.formations = formations;
	}

	public List<Message> getMessages() {
		return messages;
	}

	public void setMessages(List<Message> messages) {
		this.messages = messages;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Session [id=" + id + ", nom=" + nom + "]";
	}

}
