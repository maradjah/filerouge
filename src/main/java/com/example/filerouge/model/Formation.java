package com.example.filerouge.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Formation implements Serializable {

	private static final long serialVersionUID = -7816984239817183295L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String label;
	private Date dateDebut;
	private Date dateFin;

	@OneToMany(mappedBy = "formation")
	@JsonIgnore
	private List<Etudiant> etudiants = new ArrayList<>();

	@ManyToOne
	private Enseignant enseignant;

	@ManyToOne
	@JsonIgnore
	private Session session;

	@OneToMany(mappedBy = "formation")
	@JsonIgnore
	private List<Cours> cours = new ArrayList<>();
	
	@OneToMany(mappedBy = "formation")
	@JsonIgnore
	private List<Evaluation> evaluations = new ArrayList<>();

	public List<Cours> getCours() {
		return cours;
	}

	public void setCours(List<Cours> cours) {
		this.cours = cours;
	}

	public List<Evaluation> getEvaluations() {
		return evaluations;
	}

	public void setEvaluations(List<Evaluation> evaluations) {
		this.evaluations = evaluations;
	}

	public Session getSession() {
		return session;
	}

	public void setSession(Session session) {
		this.session = session;
	}

	public Enseignant getEnseignant() {
		return enseignant;
	}

	public void setEnseignant(Enseignant enseignant) {
		this.enseignant = enseignant;
	}

	public Formation() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Formation(String label, Date dateDebut, Date dateFin) {

		this.label = label;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public Date getDateDebut() {
		return dateDebut;
	}

	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}

	public Date getDateFin() {
		return dateFin;
	}

	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}

	public List<Etudiant> getEtudiants() {
		return etudiants;
	}

	public void setEtudiants(List<Etudiant> etudiants) {
		this.etudiants = etudiants;
	}

	@Override
	public String toString() {
		return "Formation [id=" + id + ", label=" + label + "]";
	}

}
