package com.cn.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class LogHelper{

    public static String type = null;

    public static void log(Object object) {
        System.out.println(object.toString());

        Class value =  object.getClass();

        StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[2];

        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        String time = format.format(new Date());

        System.out.println("时间 : "+time);

        System.out.println("类名 : "+value.getName());

        System.out.println("方法名 : "+stackTraceElement.getMethodName());

        System.out.println("请求类型 : "+type);

    }
}
