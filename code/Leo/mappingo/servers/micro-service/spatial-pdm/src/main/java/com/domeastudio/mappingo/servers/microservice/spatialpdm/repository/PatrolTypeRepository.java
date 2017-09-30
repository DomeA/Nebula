package com.domeastudio.mappingo.servers.microservice.spatialpdm.repository;

import com.domeastudio.mappingo.servers.microservice.spatialpdm.pojo.system.PatrolTypeEntity;
import org.springframework.data.repository.CrudRepository;

public interface PatrolTypeRepository extends CrudRepository<PatrolTypeEntity, String> {
}
