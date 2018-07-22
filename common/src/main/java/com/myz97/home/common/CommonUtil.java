package com.myz97.home.common;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.lang.reflect.Type;

/**
 * @author myz
 */
public class CommonUtil {

    private static final Gson COMMON_GSON = new Gson();
    private static final Gson REST_GSON = new GsonBuilder()
            .setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES).create();

    public static String restToJson(Object obj) {
        return REST_GSON.toJson(obj);
    }

    public static <T> T restFromJson(String json, Type type) {
        return REST_GSON.fromJson(json, type);
    }
}
