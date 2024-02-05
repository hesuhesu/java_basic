package dataType;

import java.util.ArrayList;
import java.util.HashMap;

public class dataType_map {
    public static void main(String[] args){

        HashMap<String, String> map = new HashMap<>();
        map.put("people", "사람");
        map.put("baseball", "야구");
        System.out.println(map.get("people")); // "사람" 출력
        System.out.println(map.get("java"));  // 없다면 null 출력

        System.out.println(map.containsKey("people"));  // 있는지 boolean으로 출력. true 출력
        System.out.println(map.remove("people"));  // 해당 key 제거. "사람" 출력
        System.out.println(map.size()); // 위에서 remove 했으므로 1 출력.

        map.put("people", "사람");
        System.out.println(map.keySet());  // 모든 key를 출력. [people, baseball] 출력

        // map의 모든 key를 모아서 집합 자료형으로 리턴한다.
        ArrayList<String> keyList = new ArrayList<>(map.keySet());

        // LinkedHashMap : 입력된 순서대로 데이터를 저장한다.
        // TreeMap : 입력된 key의 오름차순으로 데이터를 저장한다.
    }
}