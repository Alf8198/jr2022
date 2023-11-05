package com.javarush.task.task15.task1514;

import java.util.HashMap;
import java.util.Map;

/* 
Статики-1
*/

public class Solution {
    public static Map<Double, String> labels = new HashMap<Double, String>();
    static {
        labels.put(1.0d,"a-ha");
        labels.put(2.0d,"kiss-kiss");
        labels.put(3.0d,"elvira");
        labels.put(4.0d,"zatochka");
        labels.put(5.0d,"rick");
    }

    public static void main(String[] args) {
        System.out.println(labels);
    }
}
