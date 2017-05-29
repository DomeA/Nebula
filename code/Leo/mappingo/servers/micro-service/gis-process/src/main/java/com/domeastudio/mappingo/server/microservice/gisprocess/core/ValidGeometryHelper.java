package com.domeastudio.mappingo.server.microservice.gisprocess.core;


import com.vividsolutions.jts.geom.Geometry;
import com.vividsolutions.jts.geom.GeometryCollection;
/**
 * Created by domea on 17-5-29.
 */
public final class ValidGeometryHelper {
    public static Boolean isValidAndNotEmpty(Geometry geometry){
        return !geometry.isEmpty()&&geometry.isValid();
    }

    public static Boolean isGeometryCollection(Geometry geometry){
        return geometry.getClass().equals(GeometryCollection.class);
    }
}
