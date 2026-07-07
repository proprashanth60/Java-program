package services;
import java.util.ArrayList;
import java.util.List;

import fooddeliverysystem.Restaurant;
import fooddeliverysystem.fooditem;

public class foodservice {

    private List<Restaurant> restaurants = new ArrayList<>();

    public void addRestaurant(Restaurant restaurant) {
        restaurants.add(restaurant);
    }

    public List<Restaurant> getRestaurants() {
        return restaurants;
    }

    public List<fooditem> getAllFoodItems() {
        List<fooditem> allFoodItems = new ArrayList<>();

        for (Restaurant restaurant : restaurants) {
            allFoodItems.addAll(restaurant.getMenu());
        }

        return allFoodItems;
    }

    public void addFoodItemToRestaurant(int restaurantId, fooditem foodItem) {
        // add code to add food item into restaurant
    }

    public void removeFoodItemFromRestaurant(int restaurantId, int foodItemId) {
        // add code to remove given item from restaurant
    }
}


