package com.example.filerouge.services;

import java.util.List;
import java.util.Optional;

import com.example.filerouge.model.Evaluation;

public interface EvaluationService {
	public List<Evaluation> getAllEvaluations();
	public Evaluation createEvaluation(Evaluation evaluation);
	public Evaluation updateEvaluation(Evaluation evaluation);
	public Optional<Evaluation> getEvaluationById(Long id);
	public void deleteEvaluation(Long id);
}
