package org.example.service;

import org.example.model.Project;
import org.example.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProjectServiceImpl implements ProjectService {

    @Autowired
    private ProjectRepository projectRepository;

    @Override
    public List<Project> getAllProjects() {
        return projectRepository.findAll();
    }

    @Override
    public Optional<Project> getProjectById(Long id) {
        return projectRepository.findById(id);
    }

    @Override
    public Project createProject(String name, String date) {
        Project project = new Project();
//        project.setTitle(name);
//        project.setDescription(date);
        return projectRepository.save(project);
    }
}
