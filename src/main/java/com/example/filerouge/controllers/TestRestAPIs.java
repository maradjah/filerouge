package com.example.filerouge.controllers;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
 
@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
public class TestRestAPIs {
	
	@GetMapping("/api/test/admin")
	@PreAuthorize("hasRole('ADMIN')")
	public String adminAccess() {
		return ">>> ADMIN Contents!";
	}
 
	@GetMapping("/api/test/personnel")
	@PreAuthorize("hasRole('PERSONNEL')")
	public String personnelAccess() {
		return ">>> PERSONNEL Management Board";
	}
	
	@GetMapping("/api/test/etudiant")
	@PreAuthorize("hasRole('ETUDIANT')")
	public String etudiantAccess() {
		return ">>> ETUDIANT Contents";
	}
	@GetMapping("/api/test/formateur")
	@PreAuthorize("hasRole('FORMATEUR')")
	public String formateurAccess() {
		return ">>> FORMATEUR Contents";
	}
}
