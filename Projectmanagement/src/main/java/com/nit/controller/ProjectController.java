package com.nit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.nit.entity.Project;
import com.nit.service.ProjectService;


@Controller
public class ProjectController { 
	@Autowired
	private ProjectService projectService;
	
	@GetMapping("/")
	public String home() {
		return "home";	
	}
	
	@GetMapping("/getAllProjects")
	public String getAllProjects(Model model ) {
		List<Project> projects=projectService.getAllProjects();
		model.addAttribute("projects",projects);
		return "projects";	
	}
	
	@GetMapping("/addProject")
	public String addProject(Model model ) {
		model.addAttribute(new Project());
		return "add_project";	
	}
	
	@PostMapping("/saveProject")
	public String saveProject(@ModelAttribute("project") Project project) {
		projectService.saveProjects(project);
		return "redirect:/getAllProjects";	
	}
	
	@GetMapping("/deleteProject/{id}")
	public String addProject(@PathVariable(value = "id") Long id) {
		projectService.deleteProject(id);
		return "redirect:/getAllProjects";	
	}
}
