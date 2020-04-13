package com.atguigu.aop;

import java.util.*;

public class MathCalculator {

    public static int div(int i, int j) {
        HashMap<String, String> map = new HashMap<>();
        map.put("a","a");
        map.put("b","b");
        // 1
        Set<Map.Entry<String, String>> entries = map.entrySet();
        Iterator<Map.Entry<String, String>> iterator = entries.iterator();
        while (iterator.hasNext()) {
			Map.Entry<String, String> next = iterator.next();
			System.out.println(next.getKey()+"->"+next.getValue());
		}
        //2
        Set<String> strings = map.keySet();
        for (String s:strings) {
            System.out.println(s);
        }
        Collection<String> values = map.values();
        for (String va:values) {
            System.out.println(va);
        }
        //3
        map.forEach((key,value)->{
            System.out.println(key+"->"+value);
        });




        System.out.println("MathCalculator...div...");
        return i / j;
    }

	public static void main(String[] args) {
		div(1,1);
	}

}
