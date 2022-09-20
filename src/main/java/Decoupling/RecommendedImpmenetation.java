package Decoupling;

public class RecommendedImpmenetation {
    public Filter filter;

    public RecommendedImpmenetation(Filter filter){

        this.filter = filter;
    }

    public String [] recommendMovie(String movie){
        System.out.println("Checking the filter names in usage:" + filter + "\n");
        String[] resultMovies = filter.getRecommendations("ET");

        return resultMovies;


    }



}
