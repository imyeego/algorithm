package com.imyeego.test;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public class AbstractParser<T> {

    public void parseGenericType() {
        Type genericSuperclass = getClass().getGenericSuperclass();
        Type[] types = ((ParameterizedType)genericSuperclass).getActualTypeArguments();
        Type resultType = types[0];
        System.out.println(resultType);

    }
}
