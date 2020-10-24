package domain.food.model;

import io.quarkus.mongodb.panache.MongoEntity;
import io.quarkus.mongodb.panache.PanacheMongoEntity;
import lombok.Getter;
import lombok.Setter;

import java.time.DayOfWeek;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@MongoEntity(collection = "Menus")
public class Menu extends PanacheMongoEntity {

    private String name;
    private String description;
    private DayOfWeek dayOfWeek;
    private boolean active;
    private List<Food> foods = new ArrayList<>();

}
