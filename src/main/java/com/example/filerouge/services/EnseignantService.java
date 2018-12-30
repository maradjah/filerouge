package com.example.filerouge.services;

import java.util.List;
import java.util.Optional;

import com.example.filerouge.model.Enseignant;

public interface EnseignantService {
	public List<Enseignant> getAllEnseignants();
	public Enseignant createEnseignant(Enseignant enseignant);
	public Enseignant updateEnseignant(Enseignant enseignant);
	public Optional<Enseignant> getEnseignantById(Long id);
	public void deleteEnseignant(Long id);

}
