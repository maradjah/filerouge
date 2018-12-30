package com.example.filerouge.services;

import java.util.List;
import java.util.Optional;

import com.example.filerouge.model.Formation;

public interface FormationService {
	public List<Formation> getAllFormations();
	public Formation createFormation(Formation formation);
	public Formation updateFormation(Formation formation);
	public Optional<Formation> getFormationById(Long id);
	public void deleteFormation(Long id);
}
