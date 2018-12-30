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

import com.example.filerouge.model.Exercice;
import com.example.filerouge.services.ExerciceService;

@RestController
@RequestMapping("/exercice")
public class ExerciceController {

	@Autowired
	private ExerciceService exerciceService;

	@GetMapping("/exercices")
	public List<Exercice> getAllExercices() {
		return exerciceService.getAllExercices();
	}
	@GetMapping(value="/{id}")
	public Optional<Exercice> getExerciceById(@PathVariable("id") Long id) {
		return exerciceService.getExerciceById(id);
	}

	@PostMapping(path = "/exercice")
	public Exercice createExercice(@RequestBody Exercice exercice) {
		return exerciceService.createExercice(exercice);
	}

	@PutMapping(path = "/exercice")
	public Exercice updateExercice(@RequestBody Exercice exercice) {
		return exerciceService.updateExercice(exercice);
	}
	@DeleteMapping(value="/{id}")
	public void deleteExercice(@PathVariable("id") Long id) {
		exerciceService.deleteExercice(id);
	}
	

}

