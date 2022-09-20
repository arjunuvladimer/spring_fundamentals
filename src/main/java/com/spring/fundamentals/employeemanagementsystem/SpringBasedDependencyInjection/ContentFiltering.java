package com.spring.fundamentals.employeemanagementsystem.SpringBasedDependencyInjection;

import org.springframework.stereotype.Component;

@Component
public class ContentFiltering implements Filter {
    public String[] getRecommendations(String movie){


        return new String[]{"Italain Job","Mission Impossible", "MI3"};
    }
}
