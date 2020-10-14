package com.sebastian_daschner.openshift.boundary;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import java.time.Instant;
import java.time.LocalDate;

@Path("hello")
public class HelloResource {

    @GET
    public String hello() {
        return "Hello my OpenShift, Du siehst gut aus. Heute ist der " + LocalDate.now();
    }

}
