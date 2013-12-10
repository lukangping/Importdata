package com.huawei.demo.model;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: twer
 * Date: 12/10/13
 * Time: 10:58 PM
 * To change this template use File | Settings | File Templates.
 */
public class FeatureCollection {
    Crs crs;
    String type;
    List<Feature> features;

    public FeatureCollection(Crs crs, String type, List<Feature> features) {
        this.crs = crs;
        this.type = type;
        this.features = features;
    }

    public Crs getCrs() {
        return crs;
    }

    public void setCrs(Crs crs) {
        this.crs = crs;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<Feature> getFeatures() {
        return features;
    }

    public void setFeatures(List<Feature> features) {
        this.features = features;
    }
}
