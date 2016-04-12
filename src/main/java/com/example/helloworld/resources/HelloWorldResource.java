package com.example.helloworld.resources;

import com.example.helloworld.TasksList;
import com.example.helloworld.api.Saying;
import com.codahale.metrics.annotation.Timed;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/tasks")
@Produces(MediaType.APPLICATION_JSON)

/**
 * Created by fradkine on 12/04/2016
 */
public class HelloWorldResource {

    public HelloWorldResource() {
    }

    @GET
    @Timed
    public List<Saying> getTasks() {
        return TasksList.getInstance().getTasks();
    }

    @POST
    @Timed
    public Saying postTask(Saying task) {
        TasksList.getInstance().addTask(task);
        return task;
    }
}
