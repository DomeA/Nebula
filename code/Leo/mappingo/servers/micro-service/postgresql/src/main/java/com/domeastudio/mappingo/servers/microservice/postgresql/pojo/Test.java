package com.domeastudio.mappingo.servers.microservice.postgresql.pojo;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.io.Serializable;

@ConfigurationProperties(prefix = "postgresql")
public class Test  implements Serializable {
    private String name;
    private  int id;
    private  String key;

    public Test() {

    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getKey() {
        return key;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setKey(String key) {
        this.key = key;
    }
}
