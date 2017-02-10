package com.vuong.rest;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.StreamingOutput;
import java.io.InputStream;

public class CustomerResourceService implements CustomerResource {

    @Override
    public Response createCustomer(InputStream inputStream) {
        return null;
    }

    @Override
    public StreamingOutput getCustomer(Long id) {
        return null;
    }

    @Override
    public void updateCustomer(Long id, InputStream inputStream) {

    }
}
