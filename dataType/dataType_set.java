package dataType;

import java.util.Arrays;
import java.util.HashSet;

public class dataType_set {
    public static void main(String[] args){

        HashSet<String> set = new HashSet<>(Arrays.asList("H", "e", "l", "l", "o"));
        System.out.println(set);  //  [e, H, l, o] 출력

        // 집합의 특징 - 1 : 중복 허용 x
        // 집합의 특징 - 2 : 순서가 없다(Unordered)

        HashSet<Integer> s1 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        HashSet<Integer> s2 = new HashSet<>(Arrays.asList(4, 5, 6, 7, 8, 9));
        // 제네릭스로 int를 사용하고 싶다면 int의 Wrapper 클래스인 Integer를 대신 사용해야 한다.

        // 교집합
        HashSet<Integer> intersection = new HashSet<>(s1);  // s1으로 intersection 생성
        intersection.retainAll(s2);  // 교집합 수행
        System.out.println(intersection);  // [4, 5, 6] 출력

        // 합집합
        HashSet<Integer> union = new HashSet<>(s1);  // s1으로 union 생성
        union.addAll(s2); // 합집합 수행
        System.out.println(union);  // [1, 2, 3, 4, 5, 6, 7, 8, 9] 출력

        // 차집합
        HashSet<Integer> substract = new HashSet<>(s1);  // s1으로 substract 생성
        substract.removeAll(s2); // 차집합 수행
        System.out.println(substract);  // [1, 2, 3] 출력

        //
        HashSet<String> set2 = new HashSet<>();
        set2.add("Jump");
        set2.add("To");
        set2.add("Java");
        set2.addAll(Arrays.asList("To2", "Java2")); // 한번에 여러 개 추가.
        System.out.println(set2);  // [Java, To, Jump, To2, Java2] 출력

        set2.remove("To");
        System.out.println(set2);  // [Java, Jump, To2, Java2] 출력

        // TreeSet : 값을 오름차순으로 정렬해 저장한다.
        // LinkedHashSet : 값을 입력한 순서대로 정렬한다.
    }
}
