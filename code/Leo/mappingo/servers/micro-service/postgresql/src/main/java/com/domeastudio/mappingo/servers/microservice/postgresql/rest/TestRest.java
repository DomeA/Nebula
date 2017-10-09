package com.domeastudio.mappingo.servers.microservice.postgresql.rest;

import com.domeastudio.mappingo.servers.microservice.postgresql.service.impl.TestImpl;
public class TestRest {
    private TestImpl testImpl;
    public void add(String name, String key){
            testImpl.add(name, key);
    }
}
