package org.example.service;

import org.example.model.Project;

import java.util.List;
import java.util.Optional;

public interface ProjectService {
    List<Project> getAllProjects();
    Optional<Project> getProjectById(Long id);
    Project createProject(String name, String date);
}
