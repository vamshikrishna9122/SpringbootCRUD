package com.nit.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nit.entity.Project;

public interface ProjectRepository extends JpaRepository<Project, Long> {

}
