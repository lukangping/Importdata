package com.huawei.demo.model;

import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: twer
 * Date: 12/10/13
 * Time: 10:38 PM
 * To change this template use File | Settings | File Templates.
 */
public class Feature {

    String type;
    Map properties;
    Geometry geometry;

    public Feature(String type, Map properties, Geometry geometry) {
        this.type = type;
        this.properties = properties;
        this.geometry = geometry;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Map getProperties() {
        return properties;
    }

    public void setProperties(Map properties) {
        this.properties = properties;
    }

    public Geometry getGeometry() {
        return geometry;
    }

    public void setGeometry(Geometry geometry) {
        this.geometry = geometry;
    }
}
