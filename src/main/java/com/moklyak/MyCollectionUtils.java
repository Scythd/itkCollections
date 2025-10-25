package com.moklyak;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MyCollectionUtils {

    public static <T> List<T> filter(List<T> source, Filter<T> filter){
        List<T> result = new ArrayList<>();
        for (T t : source) {
            result.add(filter.apply(t));
        }
        return result;
    }

    /**
     * I assume that T is immutable
     */
    public static <T> Map<T, Integer> countSame(List<T> source){
        Map<T, Integer> result = new HashMap<>();
        for (T t : source) {
            result.put(t, 0);
        }
        for (T t : source) {
            result.put(t, result.get(t) + 1);
        }
        return result;
    }

}
