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

import com.example.filerouge.model.Enseignant;
import com.example.filerouge.services.EnseignantService;

@RestController
@RequestMapping("/enseignant")
public class EnseignantController {

	@Autowired
	private EnseignantService enseignantService;

	@GetMapping("/enseignants")
	public List<Enseignant> getAllEnseignants() {
		return enseignantService.getAllEnseignants();
	}
	@GetMapping(value="/{id}")
	public Optional<Enseignant> getEnseignantById(@PathVariable("id") Long id) {
		return enseignantService.getEnseignantById(id);
	}

	@PostMapping(path = "/enseignant")
	public Enseignant createEnseignant(@RequestBody Enseignant enseignant) {
		return enseignantService.createEnseignant(enseignant);
	}

	@PutMapping(path = "/enseignant")
	public Enseignant updateEnseignant(@RequestBody Enseignant enseignant) {
		return enseignantService.updateEnseignant(enseignant);
	}
	@DeleteMapping(value="/{id}")
	public void deleteEnseignant(@PathVariable("id") Long id) {
		enseignantService.deleteEnseignant(id);
	}
	

}
