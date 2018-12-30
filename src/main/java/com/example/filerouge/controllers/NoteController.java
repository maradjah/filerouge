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

import com.example.filerouge.model.Note;
import com.example.filerouge.services.NoteService;

@RestController
@RequestMapping("/note")
public class NoteController {

	@Autowired
	private NoteService noteService;

	@GetMapping("/notes")
	public List<Note> getAllNotes() {
		return noteService.getAllNotes();
	}
	@GetMapping(value="/{id}")
	public Optional<Note> getNoteById(@PathVariable("id") Long id) {
		return noteService.getNoteById(id);
	}

	@PostMapping(path = "/note")
	public Note createNote(@RequestBody Note note) {
		return noteService.createNote(note);
	}

	@PutMapping(path = "/note")
	public Note updateNote(@RequestBody Note note) {
		return noteService.updateNote(note);
	}
	@DeleteMapping(value="/{id}")
	public void deleteNote(@PathVariable("id") Long id) {
		noteService.deleteNote(id);
	}
	

}

