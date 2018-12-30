package com.example.filerouge.services;

import java.util.List;
import java.util.Optional;

import com.example.filerouge.model.Exercice;

public interface ExerciceService {
	public List<Exercice> getAllExercices();
	public Exercice createExercice(Exercice exercice);
	public Exercice updateExercice(Exercice exercice);
	public Optional<Exercice> getExerciceById(Long id);
	public void deleteExercice(Long id);
}
