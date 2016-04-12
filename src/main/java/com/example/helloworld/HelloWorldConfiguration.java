package com.example.helloworld;

import io.dropwizard.Configuration;
import org.hibernate.validator.constraints.NotEmpty;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by fradkine on 12/04/2016
 */
public class HelloWorldConfiguration extends Configuration {
    @NotEmpty
    private String template;

    @NotEmpty
    private String defaultTask = "Default Task";

    @JsonProperty
    public String getTemplate() {
        return template;
    }

    @JsonProperty
    public void setTemplate(String template) {
        this.template = template;
    }

    @JsonProperty
    public String getDefaultTask() {
        return defaultTask;
    }

    @JsonProperty
    public void setDefaultTask(String name) {
        this.defaultTask = name;
    }
}
