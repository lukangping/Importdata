package com.huawei.demo.model;

/**
 * Created with IntelliJ IDEA.
 * User: twer
 * Date: 12/10/13
 * Time: 10:23 PM
 * To change this template use File | Settings | File Templates.
 */
public class Coordinate {

    public static double M_PI = Math.PI;
    //??度?墨卡托
    // ?度(lon)，?度(lat)
    public static double[] lonLat2Mercator(double lon,double lat){
        double[] xy = new double[2];
        double x = lon *20037258.342789/180;
        double y = Math.log(Math.tan((90+lat)*M_PI/360))/(M_PI/180);
        y = y *20037258.34789/180;
        xy[0] = x;
        xy[1] = y;
        return xy;
    }

    //墨卡托???度
    public static double[] Mercator2lonLat(double mercatorX,double mercatorY){
        double[] xy = new double[2];
        double x = mercatorX/20037258.34*180;
        double y = mercatorY/20037258.34*180;
        y= 180/M_PI*(2*Math.atan(Math.exp(y*M_PI/180))-M_PI/2);
        xy[0] = x;
        xy[1] = y;
        return xy;
    }

    public static void main(String[] args){
        double[] num = lonLat2Mercator(120.385222,36.061416);
        double x = num[0];
        double y = num[1];

        double[] lb = {x-25, y-25};
        double[] rb = {x+25, y-25};
        double[] rt = {x+25, y+25};
        double[] lt = {x-25, y+25};






        for(int i=0;i<num.length;i++)
        {
            System.out.println(num[i]);
        }
// num = Mercator2lonLat(13401221.612072535,4309075.414032666);
// for(int i=0;i<num.length;i++)
// {
// System.out.println(num[i]);
// }
    }
}
