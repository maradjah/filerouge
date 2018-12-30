package com.example.filerouge.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.filerouge.model.CV;
import com.example.filerouge.repositories.CvRepository;
@Service
public class CvServiceImpl implements CvService {

	@Autowired
	private CvRepository CvRepository;

	@Override
	public CV createCV(CV CV) {
		return CvRepository.save(CV);
	}

	@Override
	public CV updateCV(CV CV) {

		return CvRepository.save(CV);
	}

	@Override
	public Optional<CV> getCVById(Long id) {

		return CvRepository.findById(id);
	}

	@Override
	public void deleteCV(Long id) {
		if (getCVById(id) != null) {
			CvRepository.deleteById(id);
		}

	}

	@Override
	public List<CV> getAllCVs() {
		return (List<CV>) CvRepository.findAll();
	}

}
