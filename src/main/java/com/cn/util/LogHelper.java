package com.cn.util;

import java.util.Date;

public class LogHelper{

    public static void log(Object object) {
            Class value =  object.getClass();
        StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[2];
            String time = new Date().toString();
            System.out.println("时间 : "+time);
            System.out.println("类名 : "+value.getSimpleName());
            System.out.println("方法名 : "+stackTraceElement.getMethodName());
    }
}
