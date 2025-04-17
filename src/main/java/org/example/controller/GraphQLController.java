package org.example.controller;

import org.example.model.Project;
import org.example.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class GraphQLController {

    @Autowired
    private ProjectService projectService;

    @QueryMapping
    public List<Project> allProjects() {
        return projectService.getAllProjects();
    }

    @MutationMapping
    public Project createProject(@Argument String name, @Argument String date) {
        return projectService.createProject(name, date);
    }
}
