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

import com.example.filerouge.model.Session;
import com.example.filerouge.services.SessionService;

@RestController
@RequestMapping("/session")
public class SessionController {

	@Autowired
	private SessionService sessionService;

	@GetMapping("/sessions")
	public List<Session> getAllSessions() {
		return sessionService.getAllSessions();
	}
	@GetMapping(value="/{id}")
	public Optional<Session> getSessionById(@PathVariable("id") Long id) {
		return sessionService.getSessionById(id);
	}

	@PostMapping(path = "/session")
	public Session createSession(@RequestBody Session session) {
		return sessionService.createSession(session);
	}

	@PutMapping(path = "/session")
	public Session updateSession(@RequestBody Session session) {
		return sessionService.updateSession(session);
	}
	@DeleteMapping(value="/{id}")
	public void deleteSession(@PathVariable("id") Long id) {
		sessionService.deleteSession(id);
	}
	

}
