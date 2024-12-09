package com.nit.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Task {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)

	private Long id;
	private String name;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Task [id=" + id + ", name=" + name + "]";
	}
	public Task(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Task() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
