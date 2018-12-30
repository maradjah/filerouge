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

import com.example.filerouge.model.Formation;
import com.example.filerouge.services.FormationService;

@RestController
@RequestMapping("/formation")
public class FormationController {

	@Autowired
	private FormationService formationService;

	@GetMapping("/formations")
	public List<Formation> getAllFormations() {
		return formationService.getAllFormations();
	}
	@GetMapping(value="/{id}")
	public Optional<Formation> getFormationById(@PathVariable("id") Long id) {
		return formationService.getFormationById(id);
	}

	@PostMapping(path = "/formation")
	public Formation createFormation(@RequestBody Formation formation) {
		return formationService.createFormation(formation);
	}

	@PutMapping(path = "/formation")
	public Formation updateFormation(@RequestBody Formation formation) {
		return formationService.updateFormation(formation);
	}
	@DeleteMapping(value="/{id}")
	public void deleteFormation(@PathVariable("id") Long id) {
		formationService.deleteFormation(id);
	}
	

}
