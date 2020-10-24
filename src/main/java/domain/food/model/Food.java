package domain.food.model;

import domain.user.model.enumerator.UnitMeasurement;
import io.quarkus.mongodb.panache.MongoEntity;
import io.quarkus.mongodb.panache.PanacheMongoEntity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@MongoEntity(collection = "Foods")
public class Food extends PanacheMongoEntity {

    private String name;
    private Double amount;
    private Double quantity;
    private UnitMeasurement measurement;
}
