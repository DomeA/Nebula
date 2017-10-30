package com.domeastudio.mappingo.servers.microservice.postgresql.rest;

import com.domeastudio.mappingo.servers.microservice.postgresql.service.impl.CreateDbImpl;

public class CreateDbRest {
    private CreateDbImpl testImpl;
    public void add(String name, String key){
            testImpl.add(name, key);
    }
}
