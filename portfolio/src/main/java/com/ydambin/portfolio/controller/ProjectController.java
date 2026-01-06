package com.ydambin.portfolio.controller;

// DTO / Service
import com.ydambin.portfolio.dto.ProjectDto;
import com.ydambin.portfolio.services.ProjectService;

// Java Tools
import java.util.List;

// Annotations
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProjectController {

    private final ProjectService projectService;

    public ProjectController(ProjectService projectService){
        this.projectService = projectService;
    }
    
    @GetMapping("/api/projects")
    public List<ProjectDto> projects(){
        return projectService.getProjects();
    }
}