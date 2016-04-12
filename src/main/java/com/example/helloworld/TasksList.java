package com.example.helloworld;

import com.example.helloworld.api.Saying;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by fradkine on 12/04/2016
 */
public class TasksList {

    private static TasksList instance = new TasksList();
    private  List<Saying> tasks = new ArrayList<Saying>();

    private TasksList() {
    }

    public static TasksList getInstance() {
        return instance;
    }

    public Saying getTask(int id) {
        return tasks.get(id);
    }

    public List<Saying> getTasks() {
        return tasks;
    }

    public void addTask(Saying task) {
        tasks.add(task);
    }
}
