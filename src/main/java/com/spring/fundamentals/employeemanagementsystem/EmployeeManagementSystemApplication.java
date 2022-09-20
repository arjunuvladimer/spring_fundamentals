package com.spring.fundamentals.employeemanagementsystem;

// Tight Couple
import TightCoupling.RecommenderImplementation;

// Decoupling
import Decoupling.RecommendedImpmenetation;
import Decoupling.MultiFiltering;


import com.spring.fundamentals.employeemanagementsystem.SpringBasedDependencyInjection.RecommendedMovieImpmenetation;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class EmployeeManagementSystemApplication {

//	Spring Boot => Spring Framework + Embedded Server
//
//
//	Tight Coupling
//	=> Two Classes are dependent on each other
//	=> One class has to be changed to some other responsibility you can’t really do it
//
//	Decoupling/Loose Coupling
//	=> Independent Responsibilities

	public static void main(String[] args) {
		// Tight Coupling
		RecommenderImplementation recommendations = new RecommenderImplementation();

		String[] resultMovies = recommendations.recommendMovie("ET");

		System.out.println(Arrays.toString(resultMovies));

//		SpringApplication.run(EmployeeManagementSystemApplication.class, args);


		// Decoupling/Loose Couple

		RecommendedImpmenetation recommendObj = new RecommendedImpmenetation(new MultiFiltering());

		String[] finalResultMovies = recommendObj.recommendMovie("ET");

		System.out.println(Arrays.toString((finalResultMovies)));


		// Spring Based Automanaging Dependencies
		ApplicationContext appContextObj = SpringApplication.run(EmployeeManagementSystemApplication.class, args);

		// Using the appContext
		RecommendedMovieImpmenetation recommender3 = appContextObj.getBean(RecommendedMovieImpmenetation.class);

		String [] finalResultMovies3 = recommender3.recommendMovie("ET");

		System.out.println(Arrays.toString(finalResultMovies3));


	}

}
