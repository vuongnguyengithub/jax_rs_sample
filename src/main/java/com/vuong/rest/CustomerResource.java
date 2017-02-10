package com.vuong.rest;

import io.swagger.annotations.Api;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.StreamingOutput;
import java.io.InputStream;

@Path("customers")
@Api(value = "Customers")
public interface CustomerResource {

    @POST
    @Consumes(MediaType.APPLICATION_XML)
    public Response createCustomer(InputStream inputStream);

    @GET
    @Path("{id}")
    @Produces(MediaType.APPLICATION_XML)
    public StreamingOutput getCustomer(@PathParam("id") Long id);

    @PUT
    @Path("{id}")
    public void updateCustomer(@PathParam("id")Long id, InputStream inputStream);
}
