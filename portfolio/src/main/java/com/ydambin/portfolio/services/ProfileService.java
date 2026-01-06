package com.ydambin.portfolio.services;

import org.springframework.stereotype.Service;

import com.ydambin.portfolio.dto.LinksDto;
import com.ydambin.portfolio.dto.ProfileDto;;

@Service
public class ProfileService {
    public ProfileDto getProfile() {
        return new ProfileDto(
            "Y'Dambi Nieban",
            "Backend Engineer",
            "Charlotte, NC",
            "This truly is my Jujutsu Kaisen",
            new LinksDto("Link", "Link", "Link")
        );
    }
}
