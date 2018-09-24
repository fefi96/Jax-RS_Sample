package de.hhn.swp.rest.controller;

import de.hhn.swp.rest.model.PathModel;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.Arrays;
import java.util.List;

@Path("")
public class HomeController {

    private static final List<PathModel> listOfPaths = Arrays.asList(new PathModel("/persons", "Returns all persons", PathModel.HTTPMethod.GET));

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<PathModel> getAllPaths() {
        return listOfPaths;
    }

}
