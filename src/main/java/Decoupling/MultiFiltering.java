package Decoupling;

public class MultiFiltering implements  Filter{
    public String[] getRecommendations(String movie){
        return new String[]{"Ice Age", "Toy Story", "Evil Dead"};
    }
}
