package domain.user.model;

import domain.food.model.Food;
import io.quarkus.mongodb.panache.MongoEntity;
import io.quarkus.mongodb.panache.PanacheMongoEntity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@MongoEntity(collection = "Orders")
public class Order extends PanacheMongoEntity {

    private Integer qty;
    private Food food;
}
