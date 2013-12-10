package com.huawei.demo.model;

import java.math.BigDecimal;

/**
 * Created with IntelliJ IDEA.
 * User: twer
 * Date: 12/10/13
 * Time: 10:24 PM
 * To change this template use File | Settings | File Templates.
 */
public class Geometry {
    String type;
    BigDecimal[][][] coordinates;

    public Geometry(String type, BigDecimal[][][] coordinates) {
        this.type = type;
        this.coordinates = coordinates;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public BigDecimal[][][] getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(BigDecimal[][][] coordinates) {
        this.coordinates = coordinates;
    }
}
