package com.example.filerouge.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.filerouge.model.Enseignant;
import com.example.filerouge.repositories.EnseignantRepository;
@Service
public class EnseignantServiceImpl implements EnseignantService {

	@Autowired
	private EnseignantRepository EnseignantRepository;

	@Override
	public Enseignant createEnseignant(Enseignant enseignant) {
		return EnseignantRepository.save(enseignant);
	}

	@Override
	public Enseignant updateEnseignant(Enseignant enseignant) {

		return EnseignantRepository.save(enseignant);
	}

	@Override
	public Optional<Enseignant> getEnseignantById(Long id) {

		return EnseignantRepository.findById(id);
	}

	@Override
	public void deleteEnseignant(Long id) {
		if (getEnseignantById(id) != null) {
			EnseignantRepository.deleteById(id);
		}

	}

	@Override
	public List<Enseignant> getAllEnseignants() {
		return (List<Enseignant>) EnseignantRepository.findAll();
	}

}
