package com.spring.fundamentals.employeemanagementsystem.SpringBasedDependencyInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class RecommendedMovieImpmenetation {




    private Filter filter ;

    @Autowired
    @Qualifier("CF")
    public void setFilter(Filter filter) {
        this.filter = filter;
    }

    public String [] recommendMovie(String movie){
        System.out.println("Checking the filter names in usage:" + filter + "\n");

        String[] resultMovies = filter.getRecommendations("ET");

        return resultMovies;


    }



}
