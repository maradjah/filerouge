package com.example.filerouge.repositories;

import org.springframework.data.repository.CrudRepository;

import com.example.filerouge.model.Note;

public interface NoteRepository extends CrudRepository<Note, Long>{
}
