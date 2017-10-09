package com.domeastudio.mappingo.servers.microservice.postgresql.service;

public interface TestFc {
    void run();
    void reStart();
    void stop();

    void createDataBase();
    void createSchema();
    void createTable();
    void createSpatialSchema();


    void findByNameFromTableName();
    void findBySpatialData();

    void isSpatialTable();

    //空间分析
    //void
}
