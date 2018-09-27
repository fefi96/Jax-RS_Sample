package de.hhn.swp.rest.controller;

import de.hhn.swp.rest.Service.PersonService;
import de.hhn.swp.rest.model.Person;

import javax.inject.Inject;
import javax.ws.rs.*;
import java.util.List;

import static javax.ws.rs.core.MediaType.APPLICATION_JSON;

@Path("persons")
public class PersonController {

    @Inject
    private PersonService service;

    @GET
    @Produces(APPLICATION_JSON)
    public List<Person> getAll() {
        return service.getAll();
    }

    @GET
    @Path("{id}")
    @Produces(APPLICATION_JSON)
    public Person get(@PathParam("id") int id) {
        return service.get(id);
    }

    @POST
    @Consumes(APPLICATION_JSON)
    public void create(Person person) {
        service.add(person);
    }

    @PUT
    @Path("{id}")
    @Consumes(APPLICATION_JSON)
    public void update(@PathParam("id") int id, Person person) {
        service.update(id, person);
    }

    @DELETE
    @Path("{id}")
    public void delete(@PathParam("id") int id) {
        service.delete(id);
    }

}
