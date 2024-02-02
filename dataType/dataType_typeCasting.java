import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class dataType_typeCasting {
    public static void main (String[] args){
        
        
        String num = "123";
        // String -> int 형변환
        int n = Integer.parseInt(num); // Integer는 int 자료형의 Wrapper 클래스이다.
        System.out.println(n);  // 123 출력

        // int -> String 형변환
        int n2 = 123;
        String num2 = "" + n2;
        System.out.println(num2);  // 123 출력

        int n3 = 123;
        String num3 = String.valueOf(n3);
        String num4 = Integer.toString(n3);
        System.out.println(num3);  // 123 출력
        System.out.println(num4);  // 123 출력

        // String -> float, double 형변환
        String n4 = "123.456";
        double d = Double.parseDouble(n4);
        System.out.println(d);

        // int -> float, double 형변환
        int n5 = 123;
        double d1 = n5;  // 정수를 실수로 바꿀때에는 캐스팅이 필요없다.
        System.out.println(d1);  // 123.0 출력

        // float, double -> int
        double d2 = 123.456;
        int n6 = (int) d2; // 실수를 정수로 바꿀때에는 반드시 정수형으로 캐스팅해 주어야 한다.
        System.out.println(n6);  // 소숫점이 생략된 123 출력

        // float 형태의 문자열을 정수형으로 바꿀려면 NumberFormatException 이 발생함.

        final int n7 = 123;  // final로 설정하면 값을 바꿀 수 없다.
        // n7 = 456;  // 컴파일 오류 발생

        final ArrayList<String> a = new ArrayList<>(Arrays.asList("a", "b"));
        // a = new ArrayList<>(Arrays.asList("c", "d"));  // 컴파일 에러 발생

        // Unmodifiable List
        // 리스트의 경우 final로 선언할 때 리스트에 값을 더하거나(add) 뺄(remove) 수 있다.
        // 다만 재할당만 불가능할 뿐이다. 만약 값을 더하거나 빼는 것도 할 수 없게 하고 싶다면
        // List.of를 작성하여 수정할 수 없는 리스트(unmodifiable list)로 만들면 된다.
        final List<String> a2 = List.of("a", "b");
        // a2.add("c");  // UnsupportedOperationException 발생
    }
}
