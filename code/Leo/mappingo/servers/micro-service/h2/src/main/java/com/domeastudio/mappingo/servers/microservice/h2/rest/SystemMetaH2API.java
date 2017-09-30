package com.domeastudio.mappingo.servers.microservice.h2.rest;

import com.domeastudio.mappingo.servers.microservice.h2.dto.Message2Client;
import com.domeastudio.mappingo.servers.microservice.h2.pojo.SystemMetaEntity;
import com.domeastudio.mappingo.servers.microservice.h2.service.SystemMetaService;
import com.domeastudio.mappingo.servers.microservice.h2.utils.ErrorCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value="/system")
public class SystemMetaH2API {
    @Autowired
    private SystemMetaService systemMetaService;
    @Autowired
    private Message2Client message2Client;

    @RequestMapping(value="/meta/get",
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public Message2Client getSystemMetaEntities() {
        if(systemMetaService.findAll().size()>0) {
            message2Client.setCode("200");
            message2Client.setMessage(systemMetaService.findAll());
        }else{
            message2Client.setCode(ErrorCode.dataBaseSearchFaile.getKey());
            message2Client.setMessage(ErrorCode.dataBaseSearchFaile.getValue());
        }
        return message2Client;
    }

    @RequestMapping(value="/meta/get/{id}",method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public Message2Client getSystemMetaEntity(@PathVariable("id") String id) {
        if(systemMetaService.findOne(id)!=null){
            message2Client.setCode("200");
            message2Client.setMessage(systemMetaService.findOne(id));
        }else{
            message2Client.setCode(ErrorCode.dataBaseSearchFaile.getKey());
            message2Client.setMessage(ErrorCode.dataBaseSearchFaile.getValue());
        }
        return message2Client;
    }

    @RequestMapping(value="/meta/add/{tableName}/{fieldName}/{fieldType}",
            method = RequestMethod.POST,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public Message2Client addSystemMetaEntity(@PathVariable("tableName") String tableName,
                                       @PathVariable("fieldName") String fieldName,
                                       @PathVariable("fieldType") String fieldType) {

        SystemMetaEntity systemMetaEntity=new SystemMetaEntity();
        systemMetaEntity.setFieldName(fieldName);
        systemMetaEntity.setFieldType(fieldType);
        systemMetaEntity.setTableName(tableName);
        if(systemMetaService.addSystemMetaEntity(systemMetaEntity)){
            message2Client.setCode("200");
            message2Client.setMessage("添加成功");
        }else {
            message2Client.setCode(ErrorCode.dataBaseAddFaile.getKey());
            message2Client.setMessage(ErrorCode.dataBaseAddFaile.getValue());
        }
        return message2Client;
    }

    @RequestMapping(value="/meta/delete/{id}",
            method = RequestMethod.DELETE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public Message2Client deletSystemMetaEntity(@PathVariable("id") String id){
        try {
            systemMetaService.deleteSysetemMetaEntity(id);
            message2Client.setCode("200");
            message2Client.setMessage("id="+id+"的记录删除成功");
        } catch (Exception e) {
            message2Client.setCode(ErrorCode.dataBaseDeleteFaile.getKey());
            message2Client.setMessage(ErrorCode.dataBaseDeleteFaile.getValue());
            e.printStackTrace();
        }

        return message2Client;
    }

    @RequestMapping(value="/meta/delete",
            method = RequestMethod.DELETE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public Message2Client deletSystemMetaEntities(){
        try {
            systemMetaService.deleteSystemMetaEntities();
            message2Client.setCode("200");
            message2Client.setMessage("批量删除成功");
        } catch (Exception e) {
            message2Client.setCode(ErrorCode.dataBaseDeleteFaile.getKey());
            message2Client.setMessage(ErrorCode.dataBaseDeleteFaile.getValue());
            e.printStackTrace();
        }

        return message2Client;
    }
}
