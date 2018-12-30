package com.example.filerouge.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.filerouge.model.Evaluation;
import com.example.filerouge.repositories.EvaluationRepository;
@Service
public class EvaluationServiceImpl implements EvaluationService {

	@Autowired
	private EvaluationRepository evaluationRepository;

	@Override
	public Evaluation createEvaluation(Evaluation evaluation) {
		return evaluationRepository.save(evaluation);
	}

	@Override
	public Evaluation updateEvaluation(Evaluation evaluation) {

		return evaluationRepository.save(evaluation);
	}

	@Override
	public Optional<Evaluation> getEvaluationById(Long id) {

		return evaluationRepository.findById(id);
	}

	@Override
	public void deleteEvaluation(Long id) {
		if (getEvaluationById(id) != null) {
			evaluationRepository.deleteById(id);
		}

	}

	@Override
	public List<Evaluation> getAllEvaluations() {
		return (List<Evaluation>) evaluationRepository.findAll();
	}

}
