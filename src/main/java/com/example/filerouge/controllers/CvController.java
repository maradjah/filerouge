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

import com.example.filerouge.model.CV;
import com.example.filerouge.services.CvService;

@RestController
@RequestMapping("/cv")
public class CvController {

	@Autowired
	private CvService cvService;

	@GetMapping("/cvs")
	public List<CV> getAllCVs() {
		return cvService.getAllCVs();
	}
	@GetMapping(value="/{id}")
	public Optional<CV> getCVById(@PathVariable("id") Long id) {
		return cvService.getCVById(id);
	}

	@PostMapping(path = "/cv")
	public CV createCV(@RequestBody CV cv) {
		return cvService.createCV(cv);
	}

	@PutMapping(path = "/cv")
	public CV updateCV(@RequestBody CV cv) {
		return cvService.updateCV(cv);
	}
	@DeleteMapping(value="/{id}")
	public void deleteCV(@PathVariable("id") Long id) {
		cvService.deleteCV(id);
	}
	

}
