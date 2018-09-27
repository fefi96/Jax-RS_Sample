package de.hhn.swp.rest.controller;

import de.hhn.swp.rest.model.PathModel;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import java.util.Arrays;
import java.util.List;

import static javax.ws.rs.core.MediaType.APPLICATION_JSON;

@Path("")
public class HomeController {

    private static final List<PathModel> listOfPaths = Arrays.asList(
            new PathModel("/persons", "Returns all persons.", PathModel.HTTPMethod.GET),
            new PathModel("/persons/{id}", "Returns a person with the specified id.", PathModel.HTTPMethod.GET),
            new PathModel("/persons", "Posts a new person to the service.", PathModel.HTTPMethod.POST),
            new PathModel("/persons{id}", "Updates a person in the service.", PathModel.HTTPMethod.PUT),
            new PathModel("/persons/{id}", "Deletes a person from the service.", PathModel.HTTPMethod.DELETE)
    );

    @GET
    @Produces(APPLICATION_JSON)
    public List<PathModel> getAllPaths() {
        return listOfPaths;
    }

}
