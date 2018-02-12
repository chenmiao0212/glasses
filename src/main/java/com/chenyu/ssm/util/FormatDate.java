package com.chenyu.ssm.util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

/**
 * @author keliang
 * @description :
 * @create 2017-08-02 10:45
 **/
public class FormatDate {

    /**
     * 返回指定yyyy-MM-dd格式类型的时间
     * @param date  参数时间
     * @return 返回类型是字符串类型
     */

    public static String getFormatDate(Date date){
        String currentDate="";
        SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd");
        currentDate = format1.format(date);
        return currentDate;
    }
    public static String getFormatDate2(Date date){
        String currentDate="";
        SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        currentDate = format1.format(date);
        return currentDate;
    }

    public static Date getDate(String str){
        DateFormat format1 = new SimpleDateFormat("yyyy-MM-dd");
        Date data = null;
        try {
            data = format1.parse(str);
            return data;
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return data;
    }

    public static Date getDate2(String str){
        DateFormat format1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date data = null;
        try {
            data = format1.parse(str);
            return data;
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return data;
    }
    public  static int getAgeByBirth(Date birthday) {
        int age = 0;
        try {
            Calendar now = Calendar.getInstance();
            now.setTime(new Date());// 当前时间

            Calendar birth = Calendar.getInstance();
            birth.setTime(birthday);

            if (birth.after(now)) {//如果传入的时间，在当前时间的后面，返回0岁
                age = 0;
            } else {
                age = now.get(Calendar.YEAR) - birth.get(Calendar.YEAR);
                if (now.get(Calendar.DAY_OF_YEAR) > birth.get(Calendar.DAY_OF_YEAR)) {
                    age += 1;
                }
            }
            return age;
        } catch (Exception e) {//兼容性更强,异常后返回数据
            return 0;
        }
    }

    public static  String getLocalTime(String time,String time_zone) throws Exception{
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        // CST(北京时间)在东8区
        sdf.setTimeZone(TimeZone.getTimeZone(time_zone));
        Date date=sdf.parse(time);
        return sdf.format(date);
    }

}
