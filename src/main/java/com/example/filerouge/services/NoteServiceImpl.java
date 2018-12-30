package com.example.filerouge.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.filerouge.model.Note;
import com.example.filerouge.repositories.NoteRepository;
@Service
public class NoteServiceImpl implements NoteService{

	@Autowired
	private NoteRepository noteRepository;

	@Override
	public Note createNote(Note note) {
		return noteRepository.save(note);
	}

	@Override
	public Note updateNote(Note note) {

		return noteRepository.save(note);
	}

	@Override
	public Optional<Note> getNoteById(Long id) {

		return noteRepository.findById(id);
	}

	@Override
	public void deleteNote(Long id) {
		if (getNoteById(id) != null) {
			noteRepository.deleteById(id);
		}

	}

	@Override
	public List<Note> getAllNotes() {
		return (List<Note>) noteRepository.findAll();
	}

}
