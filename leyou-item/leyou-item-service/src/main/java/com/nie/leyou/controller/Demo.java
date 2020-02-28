package com.nie.leyou.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Nie ZongXin
 * @date 2020/2/25 20:24
 */
public class Demo {
    public static void main(String[] args) {
        ArrayList<Map<String, String>> maps = new ArrayList<>();
        HashMap<String, String> hashMap = new HashMap<>();
        for (int i = 0; i < 4; i++) {

            hashMap.put("key"+0,"value"+i);
            maps.add(hashMap);
        }
        System.out.println("maps = " + maps);
        for (int i = 1; i < maps.size(); i++) {
            Map<String, String> map = maps.get(i - 1);
            String key = map.get("key1");
            System.out.println("key = " + key);
            String value = map.get("value");
            System.out.println("value = " + value);
        }

    }
}
