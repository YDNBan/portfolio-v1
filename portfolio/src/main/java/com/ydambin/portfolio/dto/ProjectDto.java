package com.ydambin.portfolio.dto;
import java.util.List;

public record ProjectDto(
    int id,
    String name,
    String description,
    List<String> stack,
    String repo,
    String demo
){}
