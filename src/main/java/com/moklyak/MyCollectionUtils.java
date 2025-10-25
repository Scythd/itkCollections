package com.moklyak;


import java.util.ArrayList;
import java.util.List;

public class MyCollectionUtils {

    public static <T> List<T> filter(List<T> source, Filter<T> filter){
        List<T> result = new ArrayList<>();
        for (T t : source) {
            result.add(filter.apply(t));
        }
        return result;
    }

}
