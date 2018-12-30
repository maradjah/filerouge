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

import com.example.filerouge.model.Cours;
import com.example.filerouge.services.CoursService;
@RestController
@RequestMapping("/cours")
public class CoursController {
	
	@Autowired
	private CoursService coursService;

	@GetMapping("/cours")
	public List<Cours> getAllCourss() {
		return coursService.getAllCourss();
	}
	@GetMapping(value="/{id}")
	public Optional<Cours> getCoursById(@PathVariable("id") Long id) {
		return coursService.getCoursById(id);
	}

	@PostMapping(path = "/cours")
	public Cours createCours(@RequestBody Cours cours) {
		return coursService.createCours(cours);
	}

	@PutMapping(path = "/cours")
	public Cours updateCours(@RequestBody Cours cours) {
		return coursService.updateCours(cours);
	}
	@DeleteMapping(value="/{id}")
	public void deleteCours(@PathVariable("id") Long id) {
		coursService.deleteCours(id);
	}

}
