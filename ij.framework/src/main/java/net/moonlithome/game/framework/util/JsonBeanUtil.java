package net.moonlithome.game.framework.util;

import com.google.gson.Gson;

/**
 * Created by MF on 3/15/2015.
 */
public class JsonBeanUtil {

    private static Gson gson = new Gson();

    public static <T> T getBeanFromJson(String json, Class<T> tClass){
        return gson.fromJson(json, tClass);
    }

    public static String beanToJson(Object o){
        return gson.toJson(o);
    }
}
