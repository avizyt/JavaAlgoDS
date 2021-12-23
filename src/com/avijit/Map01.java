package com.avijit;

import java.util.HashMap;
import java.util.Map;

public class Map01 {
    public static void main(String[] args) {
        Map map = new HashMap();

        map.put("number", new Integer(1));
        map.put("text", new String("hola"));
        map.put("decimal", new Double(5.7));

        System.out.println(map);
        System.out.println(map.get("text"));
        System.out.println(map.get("decimal"));
        System.out.println(map.remove("number"));
        System.out.println(map);

        System.out.println(map.keySet());
        System.out.println(map.entrySet());

        if (!map.containsKey("byte")){
            System.out.println("There are no byte here!");
        }
    }
}
