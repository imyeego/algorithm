package com.imyeego.test;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AsmTest {

    public static void main(String[] args) {
//        System.out.println("hello world");
//        trackEvent(1000, -1, "", new HashMap<>());
//
//        System.out.println(List.class.isAssignableFrom(ArrayList.class));

//        SimpleParser parser = new SimpleParser();
//        parser.parseGenericType();
        testList();
    }

    /**
     * wmda埋点方法
     * @param id
     * @param i
     * @param bg
     * @param param
     * @return
     */
    public static Long trackEvent(long id, int i, String bg, Map<String, String> param) {
        WmdaLogHelper.addLog(id, param);
        return 0L;
    }

    static void testList() {
        var p1 = new Person();
        var p2 = new Person();
        var p3 = new Person();

        var list = List.of(p1, p2, p3);
        System.out.println(list.toString());
        var list1 = new ArrayList<Person>(list);
        System.out.println(list1);
    }
}
