package TightCoupling;

import TightCoupling.ContentFiltering;

public class RecommenderImplementation {
    public String[] recommendMovie(String movie){
        // Content Filtering

        ContentFiltering filter = new ContentFiltering();
        String[] filteredResult = filter.getRecommendations("ET");
        return filteredResult;
    }
}
