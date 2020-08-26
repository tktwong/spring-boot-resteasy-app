package com.github.appswalker.resteasyapp;

import org.springframework.stereotype.Component;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.Map;

@Component
@Path("/hello")
@Produces(MediaType.APPLICATION_JSON)
public class RESTEasyResource {

  @GET
  public String hello() {
    return "message Hello, World!";
  }
}
