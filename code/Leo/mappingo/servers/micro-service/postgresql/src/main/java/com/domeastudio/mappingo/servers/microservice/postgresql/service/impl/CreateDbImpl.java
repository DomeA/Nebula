package com.domeastudio.mappingo.servers.microservice.postgresql.service.impl;

import com.domeastudio.mappingo.servers.microservice.postgresql.pojo.Test;
import com.domeastudio.mappingo.servers.microservice.postgresql.repository.TestRepos;
import com.domeastudio.mappingo.servers.microservice.postgresql.service.DbManager;

public class CreateDbImpl implements DbManager{
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

    @Override
    public void run() {

    }

    @Override
    public void reStart() {

    }

    @Override
    public void stop() {

    }

    @Override
    public void createDataBase() {

    }

    @Override
    public void createSchema() {

    }

    @Override
    public void createTable() {

    }

    @Override
    public void createSpatialSchema() {

    }
}
