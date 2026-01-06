package com.ydambin.portfolio.controller;

import com.ydambin.portfolio.dto.ProfileDto;
import com.ydambin.portfolio.services.ProfileService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProfileController {

    private final ProfileService profileService;

    public ProfileController(ProfileService profileService){
        this.profileService = profileService;
    }
    
    @GetMapping("/api/profile")
    public ProfileDto profile() {
        return profileService.getProfile();
    }
}
