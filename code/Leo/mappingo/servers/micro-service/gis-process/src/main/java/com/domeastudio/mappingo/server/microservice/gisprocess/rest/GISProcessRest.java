package com.domeastudio.mappingo.server.microservice.gisprocess.rest;

import com.domeastudio.mappingo.server.microservice.gisprocess.core.Geometry2WKT;
import com.vividsolutions.jts.geom.Geometry;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

/**
 * Created by domea on 17-5-29.
 */
@RestController
@RequestMapping
public class GISProcessRest {
    @RequestMapping(value = "/geo2wkt",
            method = RequestMethod.POST,
            produces = MediaType.TEXT_PLAIN_VALUE,
            consumes = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody String geo2WKT(@RequestBody Geometry geometry){
        String wkt=Geometry2WKT.getInstance().getWKT(geometry);
        return wkt;
    }
}
