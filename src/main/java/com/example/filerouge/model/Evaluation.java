package com.example.filerouge.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@Entity
public class Evaluation implements Serializable{
	
	private static final long serialVersionUID = -3978970565055481343L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String url;
	
	@ManyToOne
	private Enseignant enseignant;
	
	@OneToMany(mappedBy="evaluation")
	@JsonIgnore
	private List<Note> notes;
	
	@ManyToOne
	@JsonIgnoreProperties({ "dateDebut","dateFin" })
	private Formation formation;
	
	
	public Evaluation() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public Evaluation(String url) {
		super();
		this.url = url;
	}


	public List<Note> getNotes() {
		return notes;
	}


	public void setNotes(List<Note> notes) {
		this.notes = notes;
	}


	public Formation getFormation() {
		return formation;
	}


	public void setFormation(Formation formation) {
		this.formation = formation;
	}


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Enseignant getEnseignant() {
		return enseignant;
	}

	public void setEnseignant(Enseignant enseignant) {
		this.enseignant = enseignant;
	}

	public String getUrl() {
		return url;
	}


	public void setUrl(String url) {
		this.url = url;
	}


	@Override
	public String toString() {
		return "Evaluation [id=" + id + "]";
	}
	

}
