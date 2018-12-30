package com.example.filerouge.services;

import java.util.List;
import java.util.Optional;

import com.example.filerouge.model.Cours;

public interface CoursService {
	public List<Cours> getAllCourss();
	public Cours createCours(Cours cours);
	public Cours updateCours(Cours cours);
	public Optional<Cours> getCoursById(Long id);
	public void deleteCours(Long id);
}
