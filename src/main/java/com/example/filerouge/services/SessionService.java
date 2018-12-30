package com.example.filerouge.services;

import java.util.List;
import java.util.Optional;

import com.example.filerouge.model.Session;

public interface SessionService {
	public List<Session> getAllSessions();
	public Session createSession(Session session);
	public Session updateSession(Session session);
	public Optional<Session> getSessionById(Long id);
	public void deleteSession(Long id);
}
