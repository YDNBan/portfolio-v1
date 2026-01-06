package com.ydambin.portfolio.services;

import java.util.List;
import org.springframework.stereotype.Service;
import com.ydambin.portfolio.dto.ProjectDto;;

@Service
public class ProjectService {
    public List<ProjectDto> getProjects(){
        return List.of(
            new ProjectDto(
                1,
                "Hotel Discovery Application",
                "Fullstack service that aggregates and filters hotel data using third-party APIs",
                List.of("Node.js", "Express", "React", "TypeScript", "API Integration", "Render"),
                "Link",
                "Link"
            ),
            new ProjectDto(
                2,
                "Smart Home Inventory Microservices",
                "Microservices backend exposing RESTful CRUD endpoints for smart home devices.",
                List.of("Python", "Flask", "Docker", "AWS"),
                "Link",
                "Link"
            ),
            new ProjectDto(
                3,
                "Market Web Application",
                "Backend service that allows users to sell and auction items",
                List.of("Node.js", "Express.js", "MongoDB"),
                "Link",
                "Link"
            )
        );
    }
}
