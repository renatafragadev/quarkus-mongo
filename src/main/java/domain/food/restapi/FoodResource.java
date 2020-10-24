package domain.food.restapi;

import domain.food.application.FoodService;
import domain.food.converter.FoodConverter;
import domain.food.request.FoodRequest;

import javax.annotation.Resource;
import javax.inject.Inject;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/v1/foods")
@Resource
public class FoodResource {

    @Inject
    FoodService foodService;

    @POST
    public Response.ResponseBuilder create(final FoodRequest foodRequest) {

        foodService.create(FoodConverter.fromRequest(foodRequest));

        return Response.accepted();
    }
}
