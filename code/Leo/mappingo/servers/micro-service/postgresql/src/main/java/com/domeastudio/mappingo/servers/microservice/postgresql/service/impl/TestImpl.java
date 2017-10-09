package com.domeastudio.mappingo.servers.microservice.postgresql.service.impl;

import com.domeastudio.mappingo.servers.microservice.postgresql.pojo.Test;
import com.domeastudio.mappingo.servers.microservice.postgresql.repository.TestRepos;

public class TestImpl {
    TestRepos testRepos;
    public Boolean add(String name, String key) {
        Test t = new Test();
        t.setName(name);
        t.setKey(key);
        Boolean entity =null;// testRepos.save();
        if(entity!=null){
            return true;
        }else{
            return false;
        }
    }
}
