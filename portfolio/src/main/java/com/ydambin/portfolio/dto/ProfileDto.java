package com.ydambin.portfolio.dto;

public record ProfileDto(
    String name,
    String title,
    String location,
    String tagline,
    LinksDto links
){}
