package com.example.filerouge.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.filerouge.model.Formation;
import com.example.filerouge.repositories.FormationRepository;
@Service
public class FormationServiceImpl implements FormationService{

	@Autowired
	private FormationRepository formationRepository;

	@Override
	public Formation createFormation(Formation formation) {
		return formationRepository.save(formation);
	}

	@Override
	public Formation updateFormation(Formation formation) {

		return formationRepository.save(formation);
	}

	@Override
	public Optional<Formation> getFormationById(Long id) {

		return formationRepository.findById(id);
	}

	@Override
	public void deleteFormation(Long id) {
		if (getFormationById(id) != null) {
			formationRepository.deleteById(id);
		}

	}

	@Override
	public List<Formation> getAllFormations() {
		return (List<Formation>) formationRepository.findAll();
	}

}
