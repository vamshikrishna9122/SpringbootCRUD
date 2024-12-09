package com.nit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nit.entity.Project;
import com.nit.repository.ProjectRepository;

import jakarta.transaction.Transactional;


@Service
public class ProjectService {
	@Autowired
	private ProjectRepository projectRepository;
	
	public List<Project> getAllProjects(){
		return projectRepository.findAll();
	} 
	
	@Transactional(rollbackOn = Exception.class)
	public Project saveProjects(Project project){
		return projectRepository.save(project);
	}
	
	@Transactional(rollbackOn = Exception.class)

	public void deleteProject(Long id) {
		projectRepository.deleteById(id);

	} 
}
