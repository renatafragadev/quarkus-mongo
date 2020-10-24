package domain.user.model;

import io.quarkus.mongodb.panache.PanacheMongoEntity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Address extends PanacheMongoEntity {

    private String city;
    private String street;
    private String neighborhood;
    private Integer zipCode;
    private String number;
    private String complement;
}
