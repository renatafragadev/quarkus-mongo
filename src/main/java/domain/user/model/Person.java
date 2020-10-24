package domain.user.model;

import io.quarkus.mongodb.panache.MongoEntity;
import io.quarkus.mongodb.panache.PanacheMongoEntity;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@MongoEntity(collection = "Persons")
public class Person extends PanacheMongoEntity {

    private String name;
    private String document;
    private LocalDate birthDate;
    private boolean active;
    private Address address;
    private List<Order> orders = new ArrayList<>();
}
