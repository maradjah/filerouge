package com.example.filerouge.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.filerouge.model.Etudiant;
import com.example.filerouge.repositories.EtudiantRepository;

@Service
public class EtudiantServiceImpl implements EtudiantService {

	@Autowired
	private EtudiantRepository etudiantRepository;

	@Override
	public Etudiant createEtudiant(Etudiant etudiant) {
		return etudiantRepository.save(etudiant);
	}

	@Override
	public Etudiant updateEtudiant(Etudiant etudiant) {

		return etudiantRepository.save(etudiant);
	}

	@Override
	public Optional<Etudiant> getEtudiantById(Long id) {

		return etudiantRepository.findById(id);
	}

	@Override
	public void deleteEtudiant(Long id) {
		if (getEtudiantById(id) != null) {
			etudiantRepository.deleteById(id);
		}

	}

	@Override
	public List<Etudiant> getAllEtudiants() {
		return (List<Etudiant>) etudiantRepository.findAll();
	}

}
