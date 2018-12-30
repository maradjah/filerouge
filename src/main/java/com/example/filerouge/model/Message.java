package com.example.filerouge.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;
@Entity
public class Message implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7561207446504051156L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	@JsonIgnore
	private Session session;

	public Message() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
