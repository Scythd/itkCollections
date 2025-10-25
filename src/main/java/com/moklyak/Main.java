package com.moklyak;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

//
//
public class Main {
    public static void main(String[] args) {
        List<Integer> araryList = new ArrayList<>(List.of(1, 3, 5, 7, 9));
        List<Integer> linkedList = new LinkedList<>(List.of(2, 4, 6, 8, 0));
        Filter<Integer> f = x -> x * x;

        araryList = MyCollectionUtils.filter(araryList, f);
        linkedList = MyCollectionUtils.filter(linkedList, f);

        System.out.println(araryList);
        System.out.println(linkedList);
    }
}