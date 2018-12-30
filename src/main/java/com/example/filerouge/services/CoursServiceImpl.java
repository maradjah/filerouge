package com.example.filerouge.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.filerouge.model.Cours;
import com.example.filerouge.repositories.CoursRepository;
@Service
public class CoursServiceImpl implements CoursService{

	@Autowired
	private CoursRepository CoursRepository;

	@Override
	public Cours createCours(Cours cours) {
		return CoursRepository.save(cours);
	}

	@Override
	public Cours updateCours(Cours cours) {

		return CoursRepository.save(cours);
	}

	@Override
	public Optional<Cours> getCoursById(Long id) {

		return CoursRepository.findById(id);
	}

	@Override
	public void deleteCours(Long id) {
		if (getCoursById(id) != null) {
			CoursRepository.deleteById(id);
		}

	}

	@Override
	public List<Cours> getAllCourss() {
		return (List<Cours>) CoursRepository.findAll();
	}

}
