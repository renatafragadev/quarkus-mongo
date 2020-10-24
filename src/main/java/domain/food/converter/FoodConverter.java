package domain.food.converter;

import domain.food.model.Food;
import domain.food.request.FoodRequest;

public class FoodConverter {

    public static Food fromRequest(FoodRequest foodRequest) {
        var food = new Food();
        food.setName(foodRequest.getName());
        food.setAmount(foodRequest.getAmount());
        food.setMeasurement(foodRequest.getMeasurement());
        food.setQuantity(foodRequest.getQuantity());

        return food;
    }
}
