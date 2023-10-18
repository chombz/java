package com.chombz_oop.j13_adanvaced_concurrency;

import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Java program that demonstrates the ConcurrentHashMap class in the
 * java.util.concurrent package
 * @author e.chomba
 */
public class KeySetViewDemo 
{
    //main method begins program exectution
    public static void main(String[] args)
    {
        //create a map of <String, String>
        Map<String, String> map = new ConcurrentHashMap<>();
        map.put("String", "Java String");
        map.put("Java", "Java SE");
        map.put("Dart", "Flutter");
        map.put("Java EE", "Java EE");
        map.put("C#", "C Sharp");
        
        
        Set keySet = map.keySet();
        
        //Display the values in the keyset
        System.out.println(keySet);
        
    }
}
