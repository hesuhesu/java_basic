package dataType;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class dataType_arrayList {
    public static void main(String[] args) {
        ArrayList pitches = new ArrayList();
        pitches.add("138");
        pitches.add("129");
        pitches.add("142");

        pitches.add(0, "133"); // 첫번째 위치에 133 삽입.

        System.out.println(pitches.get(1)); // 2번째 Arraylist의 값을 출력.
        System.out.println(pitches.size()); // ArrayList의 요소 개수 리턴.
        System.out.println(pitches.contains("142")); // 142라는 문자열을 포함하는지 boolean으로 확인.

        System.out.println(pitches.remove("129")); // 129를 리스트에서 삭제하고, true를 리턴한다.
        System.out.println(pitches.remove(0)); // pitches의 첫 번째 항목이 138이므로, 138을 삭제한 뒤 138을 리턴한다.

        // ** 제네릭스 **
        // 제네릭스(generics)는 자바 J2SE 5.0 버전 이후에 도입된 개념으로, 자료형을 안전하게 사용할 수 있도록 만들어 주는 기능이다.
        // 제네릭스를 사용하면 자료형을 강제로 바꿀 때 생길 수 있는 캐스팅 오류를 줄일 수 있다.

        ArrayList pitches2 = new ArrayList(); // 제네릭스를 사용하지 않으면 Object 자료형으로 인식한다.
        // 값을 넣는덴 문제 x, 하지만 값을 가져올 땐 매번 object에서 String으로 형변환(Casting) 해야함.
        pitches2.add("138");
        pitches2.add("129");
        String one = (String) pitches2.get(0);
        String two = (String) pitches2.get(1);

        ArrayList<String> pitches3 = new ArrayList<>();
        pitches3.add("138");
        pitches3.add("129");

        String one2 = pitches3.get(0);  // 형 변환이 필요없다.
        String two2 = pitches3.get(1);  // 형 변환이 필요없다.

        // asList 메서드 - 1
        String[] data = {"138", "129", "142"};  // 이미 투구수 데이터 배열이 있다.
        ArrayList<String> pitches4 = new ArrayList<>(Arrays.asList(data));
        System.out.println(pitches4);  // [138, 129, 142] 출력

        // asList 메서드 - 2(비 선호)
        String[] data2 = {"138", "129", "142"};  // 이미 투구수 데이터 배열이 있다.
        ArrayList<String> pitches5 = new ArrayList<>(Arrays.asList(data));
        System.out.println(pitches5);  // [138, 129, 142] 출력

        // String.join
        // 원시적인 방법.
        ArrayList<String> pitches6 = new ArrayList<>(Arrays.asList("138", "129", "142"));
        String result = "";
        for (int i = 0; i < pitches6.size(); i++) {
            result += pitches6.get(i);
            result += ",";  // 콤마를 추가한다.
        }
        result = result.substring(0, result.length() - 1);  // 마지막 콤마는 제거한다.
        System.out.println(result);  // 138,129,142 출력

        // join을 활용한 방법.
        String result2 = String.join(",", pitches6);
        // String.join("구분자", 리스트 객체)를 사용해 리스트의 각 요소에 구분자를 넣어 하나의 문자열로 만들 수 있다.
        System.out.println(result2);  // 138,129,142 출력

        // list sort
        pitches6.sort(Comparator.naturalOrder());
        // 오름차순(순방향) 정렬 - Comparator.naturalOrder()
        // 내림차순(역방향) 정렬 - Comparator.reverseOrder() .. java 8 부터 사용 가능.
    }
}
