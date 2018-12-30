package com.example.filerouge.services;

import java.util.List;
import java.util.Optional;

import com.example.filerouge.model.CV;

public interface CvService {
	public List<CV> getAllCVs();
	public CV createCV(CV cV);
	public CV updateCV(CV cV);
	public Optional<CV> getCVById(Long id);
	public void deleteCV(Long id);
}
