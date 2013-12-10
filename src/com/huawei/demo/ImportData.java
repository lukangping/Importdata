package com.huawei.demo;

import com.huawei.demo.model.Crs;
import com.huawei.demo.model.Feature;
import com.huawei.demo.model.FeatureCollection;
import com.huawei.demo.model.Geometry;
import net.sf.json.JSONArray;

import java.io.File;
import java.io.FileOutputStream;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: twer
 * Date: 12/10/13
 * Time: 10:18 PM
 * To change this template use File | Settings | File Templates.
 */
public class ImportData {

    public static void main(String[] args) {

        List<Feature> features = new ArrayList<Feature>();

        for (int i = 0; i < 100000; i++) {
            Map properties = new HashMap();
            properties.put("num", Math.random() * 10);

            BigDecimal x = new BigDecimal(12110000 + Math.random() * 30000).setScale(2, BigDecimal.ROUND_HALF_UP);
            BigDecimal y = new BigDecimal(4054000 + Math.random() * 23000).setScale(2, BigDecimal.ROUND_HALF_UP);
            Geometry geometry = new Geometry("Polygon", getCoords(x, y));
            Feature feature = new Feature("Feature", properties, geometry);

            features.add(feature);
        }

        Map crsProp = new HashMap();
        crsProp.put("name", "urn:ogc:def:crs:EPSG:900913");
//        crsProp.put("name", "urn:ogc:def:crs:OGC:1.3:CRS84");
        Crs crs = new Crs("name", crsProp);

        FeatureCollection featureCollection = new FeatureCollection(crs, "FeatureCollection", features);

        String jsonString = JSONArray.fromObject(featureCollection).toString();
        jsonString = jsonString.substring(1, jsonString.length() - 1);

        try {
            FileOutputStream fos = new FileOutputStream(new File("demo.json"));
            fos.write(jsonString.getBytes());
            fos.flush();
            fos.close();
        } catch (Exception e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }

    }


    public static BigDecimal[][][] getCoords(BigDecimal x, BigDecimal y) {

        BigDecimal[][][] gridCoords = {{{x.subtract(new BigDecimal(25)), y.subtract(new BigDecimal(25))},
                {x.add(new BigDecimal(25)), y.subtract(new BigDecimal(25))},
                {x.add(new BigDecimal(25)), y.add(new BigDecimal(25))},
                {x.subtract(new BigDecimal(25)), y.add(new BigDecimal(25))}}};
        return gridCoords;


    }


}
