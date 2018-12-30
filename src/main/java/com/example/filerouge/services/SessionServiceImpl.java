package com.example.filerouge.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.filerouge.model.Session;
import com.example.filerouge.repositories.SessionRepository;
@Service
public class SessionServiceImpl implements SessionService {

	@Autowired
	private SessionRepository sessionRepository;

	@Override
	public Session createSession(Session session) {
		return sessionRepository.save(session);
	}

	@Override
	public Session updateSession(Session session) {

		return sessionRepository.save(session);
	}

	@Override
	public Optional<Session> getSessionById(Long id) {

		return sessionRepository.findById(id);
	}

	@Override
	public void deleteSession(Long id) {
		if (getSessionById(id) != null) {
			sessionRepository.deleteById(id);
		}

	}

	@Override
	public List<Session> getAllSessions() {
		return (List<Session>) sessionRepository.findAll();
	}

}
