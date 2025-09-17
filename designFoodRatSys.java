package dailyquestions;

import java.util.*;

public class designFoodRatSys {
    public class FoodPair implements Comparable<FoodPair>{
    String food;
    int rating;

    public FoodPair(int rating, String food){
        this.food =  food;
        this.rating =  rating;
    }
    @Override
    public int compareTo(FoodPair fp){
        if(this.rating == fp.rating){
            return this.food.compareTo(fp.food);
        }
        return Integer.compare(fp.rating, this.rating);
    }
}

class FoodRatings {
    HashMap<String, Integer> foodRating = new HashMap<>();
    HashMap<String, String> foodCuisine = new HashMap<>();
    HashMap<String, TreeSet<FoodPair>> cuisineFoodRating = new HashMap<>();
    public FoodRatings(String[] foods, String[] cuisines, int[] ratings) {
        for(int i=0;i<foods.length;i++){
            foodRating.put(foods[i], ratings[i]);
            foodCuisine.put(foods[i], cuisines[i]);
            cuisineFoodRating.putIfAbsent(cuisines[i], new TreeSet<FoodPair>());
            cuisineFoodRating.get(cuisines[i]).add(new FoodPair(ratings[i], foods[i]));

        }
    }
    
    public void changeRating(String food, int newRating) {
        String cuisine = foodCuisine.get(food);
        
        cuisineFoodRating.get(cuisine).remove(new FoodPair(foodRating.get(food),food));
        foodRating.put(food, newRating);
        cuisineFoodRating.get(cuisine).add(new FoodPair(newRating,food));
    }
    
    public String highestRated(String cuisine) {
        TreeSet<FoodPair> set = cuisineFoodRating.get(cuisine);
        FoodPair  fp = set.first();
        return fp.food;
    }
}

/**
 * Your FoodRatings object will be instantiated and called as such:
 * FoodRatings obj = new FoodRatings(foods, cuisines, ratings);
 * obj.changeRating(food,newRating);
 * String param_2 = obj.highestRated(cuisine);
 */
}
