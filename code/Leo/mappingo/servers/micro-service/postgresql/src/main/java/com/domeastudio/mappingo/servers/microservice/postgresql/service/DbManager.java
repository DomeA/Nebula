package com.domeastudio.mappingo.servers.microservice.postgresql.service;

public interface DbManager {
    void run();
    void reStart();
    void stop();

    void createDataBase();
    void createSchema();
    void createTable();
    void createSpatialSchema();
}
