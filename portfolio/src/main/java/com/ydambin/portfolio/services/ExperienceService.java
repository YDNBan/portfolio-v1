package com.ydambin.portfolio.services;

import java.util.List;
import org.springframework.stereotype.Service;
import com.ydambin.portfolio.dto.ExperienceDto;

@Service
public class ExperienceService {
    public List<ExperienceDto> getExperience(){
        return List.of(
            new ExperienceDto(
                1,
                "Accenture",
                "MYEP Intern",
                "July 2020",
                "August 2020",
                "Insert context here",
                List.of("Figma", "Canva")
            ),
            new ExperienceDto(
                2,
                "QuikTrip",
                "Part-Time Clerk",
                "June 2022",
                "Present",
                "Insert context here",
                List.of("Customer Service", "Teamwork", "Adaptability")
            )
        );
    }
}
