package com.k3i.zsgl.common.utils;

public class StringUtils {

    public static String checkNULL(String o){
        if (o==null){
            return "";
        }
        return o;
    }

    public static Integer checkNULL(Integer o){
        if (o==null){
            return 0;
        }
        return o;
    }
}
