package com.spring.fundamentals.employeemanagementsystem.SpringBasedDependencyInjection;


import org.springframework.stereotype.Component;


public class MultiFiltering implements Filter {
    public String[] getRecommendations(String movie){
        return new String[]{"Ice Age", "Toy Story", "Evil Dead"};
    }
}
