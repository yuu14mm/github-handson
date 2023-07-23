package org.example;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> productMap = new HashMap<>();
        productMap.put("冷蔵庫", 50000);
        productMap.put("エアコン", 150000);
        productMap.put("テレビ", 60000);

        for (Map.Entry<String, Integer> entry : productMap.entrySet()) {
            System.out.println("商品名：" + entry.getKey() + "　価格：" + entry.getValue());
        }

        Map<String, Integer> productMap2 = null;
        try {
            System.out.println(productMap2.get("パソコン"));

        } catch (NullPointerException e) {
            System.out.println("取り扱いがありません。");

        }
    }
}