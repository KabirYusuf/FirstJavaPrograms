package collection;

import java.util.*;

import static java.lang.Math.random;

public class Collections{
    public static void main(String[] args) {
        Queue<String> colors = new PriorityQueue<>();

        colors.add("Blue");
        colors.add("Black");


        Map<String, Integer> map = new TreeMap<>();
        map.put("A", 1);
        map.put("B", 2);

        System.out.println("from queue" + colors);
        System.out.println("from map" + map);

        Random random = new Random();
        int num = random.nextInt(9);
        System.out.print(num);
    }
}
