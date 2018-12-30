package com.example.filerouge.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.filerouge.model.Exercice;
import com.example.filerouge.repositories.ExerciceRepository;
@Service
public class ExerciceServiceImpl implements ExerciceService{

	@Autowired
	private ExerciceRepository exerciceRepository;

	@Override
	public Exercice createExercice(Exercice exercice) {
		return exerciceRepository.save(exercice);
	}

	@Override
	public Exercice updateExercice(Exercice exercice) {

		return exerciceRepository.save(exercice);
	}

	@Override
	public Optional<Exercice> getExerciceById(Long id) {

		return exerciceRepository.findById(id);
	}

	@Override
	public void deleteExercice(Long id) {
		if (getExerciceById(id) != null) {
			exerciceRepository.deleteById(id);
		}

	}

	@Override
	public List<Exercice> getAllExercices() {
		return (List<Exercice>) exerciceRepository.findAll();
	}

}
