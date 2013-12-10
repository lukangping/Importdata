package com.huawei.demo.model;

import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: twer
 * Date: 12/10/13
 * Time: 11:31 PM
 * To change this template use File | Settings | File Templates.
 */
public class Crs {
    String type;
    Map properties;

    public Crs(String type, Map properties) {
        this.type = type;
        this.properties = properties;
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
}
