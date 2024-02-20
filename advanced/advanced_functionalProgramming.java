package advanced;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;

@FunctionalInterface // 해당 어노테이션을 사용하면 2개 이상의 메서드를 가진 인터페이스는 허용 x
interface Calculator {
    int sum(int a, int b);
    // int mul(int a, int b);
}
class MyCalculator implements Calculator {
    public int sum(int a, int b) {
        return a+b;
    }
}
public class advanced_functionalProgramming {
    public static void main (String[] args){

        Calculator mc = (int a, int b) -> a+b;
        // new MyCalculator(); 대신, 람다를 사용.
        // MyCalculator 같은 실제 클래스 없이 Calculator 객체를 생성 가능하고 일반적인 코드보다 훨씬 간결해짐.
        int result = mc.sum(3, 4);
        System.out.println(result);  // 7 출력

        // Calculator 인터페이스의 메서드가 1개 이상이면 람다 함수 사용 안됨.

        Calculator mc2 = Integer::sum;
        int result2 = mc2.sum(5,8);
        System.out.println(result2);  // 13 출력

        // 배열에서 짝수만 찾아 중복 제외하고 역순으로 정렬
        // 통상적 방법

        int[] data = {5, 6, 4, 2, 3, 1, 1, 2, 2, 4, 8};

        // 짝수만 포함하는 ArrayList 생성
        ArrayList<Integer> dataList = new ArrayList<>();
        for(int i=0; i<data.length; i++) {
            if(data[i] % 2 == 0) {
                dataList.add(data[i]);
            }
        }
        // Set을 사용하여 중복을 제거
        HashSet<Integer> dataSet = new HashSet<>(dataList);
        // Set을 다시 List로 변경
        ArrayList<Integer> distinctList = new ArrayList<>(dataSet);
        // 역순으로 정렬
        distinctList.sort(Comparator.reverseOrder());
        // Integer 리스트를 정수 배열로 변환
        int[] result3 = new int[distinctList.size()];
        for(int i=0; i< distinctList.size(); i++) {
            result3[i] = distinctList.get(i);
        }
        System.out.println(Arrays.toString(result3));
        // stream 을 활용한 방법

        int[] data2 = {5, 6, 4, 2, 3, 1, 1, 2, 2, 4, 8};
        int[] result4 = Arrays.stream(data2)  // IntStream을 생성한다.
                .boxed()  // IntStream을 Stream<Integer>로 변경한다.
                .filter((a) -> a % 2 == 0)  //  짝수만 뽑아낸다.
                .distinct()  // 중복을 제거한다.
                .sorted(Comparator.reverseOrder())  // 역순으로 정렬한다.
                .mapToInt(Integer::intValue)  // Stream<Integer>를 IntStream으로 변경한다.
                .toArray()  // int[] 배열로 반환한다.
                ;

        System.out.println(Arrays.toString(result4));
        // 스트림 방식은 일반적인 코드보다 확실히 간결하고 가독성이 좋다는 것을 확인할 수 있다.
    }
}