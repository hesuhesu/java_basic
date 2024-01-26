public class dataType_string {
    public static void main(String[] args) {

        char a1 = 'a';  // 문자로 표현
        char a2 = 97;  // 아스키코드로 표현
        char a3 = '\u0061';  // 유니코드로 표현

        System.out.println(a1);  // a 출력
        System.out.println(a2);  // a 출력
        System.out.println(a3);  // a 출력

        // 문자열의 앞과 뒤는 쌍따옴표("")로 감싸야 한다.
        // 해당 코드는 리터럴 표기 방식. 가독성 + 컴파일 최적화에 도움 됨.
        String a = "Happy Java";
        String b = "a";
        String c = "123";

        // 해당 코드는 객체 생성 방식. 리터럴 표기 방식을 애용하자.
        // String a = new String("Happy Java"); // 객체 만들 때 사용.
        // String b = new String("a");
        // String c = new String("123");

        System.out.println(a.indexOf("Java"));  //  특정 문자열이 시작되는 위치(인덱스값)를 리턴한다. 6출력
        System.out.println(a.contains("Java")); // 특정 문자열이 존재하는 여부 리턴
        System.out.println(a.charAt(6)); // 문자열의 특정 위치를 리턴
        System.out.println(a.replaceAll("Java", "World")); // 특정 문자열을 다른 문자열로 바꿀 때 사용.
        System.out.println(a.substring(0, 4)); // 특정 문자열을 뽑아서 쓸 때 사용
        System.out.println(a.toUpperCase()); // 문자열을 모두 대문자로 변경
        System.out.println(a.toLowerCase()); // 문자열을 모두 소문자로 변경

        String semi = "a:b:c:d";
        String[] result = semi.split(":");  // result는 {"a", "b", "c", "d"}

        // 문자열 format

        System.out.println(String.format("I eat %d apples.", 3));
        System.out.printf("I eat %d apples.", 3); // 위의 코드와 동일함.

        System.out.println(String.format("I eat %s apples.", "five"));
        System.out.printf("I eat %s apples.", "five");

        int number = 10;
        String day = "three";
        System.out.println(String.format("I ate %d apples. so I was sick for %s days.", number, day));
    
        // 정렬과 공백 응용

        System.out.println(String.format("%10s", "hi")); // 10칸 앞부분을 공백으로 띄움.
        System.out.println(String.format("%-10sjane.", "hi")); // 10칸 뒷부분을 공백으로 띄움.
        System.out.println(String.format("%.4f", 3.42134234)); // 소숫점 4자리까지 나타냄.

        // System.out.printf는 문자열을 출력하는 메서드.
        // System.out.println(String.format())은 문자열을 리턴하는 메서드이다.
    }
}