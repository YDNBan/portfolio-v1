package com.ydambin.portfolio.dto;
import java.util.List;

public record ExperienceDto(
    int id,
    String company,
    String role,
    String dateBegin,
    String dateEnd,
    String description,
    List<String> tech
){}
