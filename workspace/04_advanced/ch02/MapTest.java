package ch02;

import java.util.*;

public class MapTest {
    void main(){
        Map fruits = new HashMap();

        fruits.put("월", "바나나");
        fruits.put("화", "사과");
        fruits.put("수", "오렌지");
        fruits.put("목", "파인애플");
        fruits.put("수", "수박");
        fruits.put("금", 12345);

        String fridayFruit = ((String)fruits.get("금")).toUpperCase();
        System.out.println("금요일에 먹을 과일: " + fridayFruit);

        printFruits(fruits);
    }

    void printFruits(Map fruits){
        System.out.println("월요일에 먹을 과일: " + fruits.get("월"));
        System.out.println("수요일에 먹을 과일: " + fruits.get("수"));
        System.out.println("화요일에 먹을 과일: " + fruits.get("화"));


    }
}

