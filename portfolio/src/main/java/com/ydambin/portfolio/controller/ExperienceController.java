package com.ydambin.portfolio.controller;

import java.util.List;
// DTO / Service
import com.ydambin.portfolio.dto.ExperienceDto;
import com.ydambin.portfolio.services.ExperienceService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExperienceController {

    private final ExperienceService experienceService;

    public ExperienceController(ExperienceService experienceService){
        this.experienceService = experienceService;
    }
    
    @GetMapping("/api/experience")
    public List<ExperienceDto> experience(){
        return experienceService.getExperience();
    }
}
