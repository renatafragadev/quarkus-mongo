package domain.food.request;

import domain.user.model.enumerator.UnitMeasurement;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class FoodRequest {

    private String name;
    private Double amount;
    private Double quantity;
    private UnitMeasurement measurement;
}
