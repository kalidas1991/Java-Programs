package com.bytebrains.string;

import java.util.HashMap;
import java.util.Map;

public class CountOccurences {
    public static void main(String[] args) {
        String str = "KalidasDaundkar";
        char strArray[] = str.toCharArray();
        Map<Character,Integer> map =new HashMap<>();
        for (char ch: strArray){
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }
            else {
                map.put(ch, 1);
            }
        }
        for (Map.Entry entry : map.entrySet()){
            System.out.println(entry.getKey() +" : "+entry.getValue());
        }
    }
}
