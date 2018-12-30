package com.example.filerouge.services;

import java.util.List;
import java.util.Optional;

import com.example.filerouge.model.Etudiant;

public interface EtudiantService {
	
	public List<Etudiant> getAllEtudiants();
	public Etudiant createEtudiant(Etudiant etudiant);
	public Etudiant updateEtudiant(Etudiant etudiant);
	public Optional<Etudiant> getEtudiantById(Long id);
	public void deleteEtudiant(Long id);
	
}
