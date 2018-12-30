package com.example.filerouge.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.filerouge.model.Etudiant;
import com.example.filerouge.services.EtudiantService;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/etudiant")
public class EtudiantController {

	@Autowired
	private EtudiantService etudiantService;

	@GetMapping("/etudiants")
	@PreAuthorize("hasRole('ADMIN')")
	public List<Etudiant> getAllEtudiants() {
		List<Etudiant> etudiants = new ArrayList<>();
		etudiantService.getAllEtudiants().forEach(etudiants::add);
		return etudiants;
	}
	@GetMapping(value="/{id}")
	@PreAuthorize("hasRole('ADMIN') or hasRole('PERSONNEL')")
	
	public Optional<Etudiant> getEtudiantById(@PathVariable("id") Long id) {
		return etudiantService.getEtudiantById(id);
	}

	@PostMapping(path = "/etudiant")
	@PreAuthorize("hasRole('ADMIN')")
	public Etudiant createEtudiant(@RequestBody Etudiant etudiant) {
		return etudiantService.createEtudiant(etudiant);
	}

	@PutMapping(path = "/etudiant")
	@PreAuthorize("hasRole('ADMIN')")
	public Etudiant updateEtudiant(@RequestBody Etudiant etudiant) {
		return etudiantService.updateEtudiant(etudiant);
	}
	@DeleteMapping(value="/{id}")
	@PreAuthorize("hasRole('ADMIN')")
	public void deleteEtudiant(@PathVariable("id") Long id) {
		etudiantService.deleteEtudiant(id);
	}	

}
