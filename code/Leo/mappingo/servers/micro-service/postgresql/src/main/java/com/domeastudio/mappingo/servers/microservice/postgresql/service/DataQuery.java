package com.domeastudio.mappingo.servers.microservice.postgresql.service;

public interface DataQuery {
    void findByNameFromTableName();
    void findBySpatialData();

    void isSpatialTable();

    //空间分析
    //void
}
