package com.example.filerouge.services;

import java.util.List;
import java.util.Optional;

import com.example.filerouge.model.Note;

public interface NoteService {
	public List<Note> getAllNotes();
	public Note createNote(Note note);
	public Note updateNote(Note note);
	public Optional<Note> getNoteById(Long id);
	public void deleteNote(Long id);

}
