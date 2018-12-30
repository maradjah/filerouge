package com.example.filerouge.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.filerouge.model.Evaluation;
import com.example.filerouge.services.EvaluationService;

@RestController
@RequestMapping("/evaluation")
public class EvaluationController {

	@Autowired
	private EvaluationService evaluationService;

	@GetMapping("/evaluations")
	public List<Evaluation> getAllEvaluations() {
		return evaluationService.getAllEvaluations();
	}
	@GetMapping(value="/{id}")
	public Optional<Evaluation> getEvaluationById(@PathVariable("id") Long id) {
		return evaluationService.getEvaluationById(id);
	}

	@PostMapping(path = "/evaluation")
	public Evaluation createEvaluation(@RequestBody Evaluation evaluation) {
		return evaluationService.createEvaluation(evaluation);
	}

	@PutMapping(path = "/evaluation")
	public Evaluation updateEvaluation(@RequestBody Evaluation evaluation) {
		return evaluationService.updateEvaluation(evaluation);
	}
	@DeleteMapping(value="/{id}")
	public void deleteEvaluation(@PathVariable("id") Long id) {
		evaluationService.deleteEvaluation(id);
	}
	

}
