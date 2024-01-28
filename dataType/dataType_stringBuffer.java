public class dataType_stringBuffer {
    public static void main (String[] args){

        StringBuffer sb1 = new StringBuffer();  // StringBuffer 객체 sb 생성
        sb1.append("hello");
        sb1.append(" ");
        sb1.append("jump to java");
        String result1 = sb1.toString();
        System.out.println(result1);  // "hello jump to java" 출력

        String result2 = "";
        result2 += "hello";
        result2 += " ";
        result2 += "jump to java";
        System.out.println(result2);  // "hello jump to java" 출력

        // 두 개의 결과는 같지만. stringBuffer는 객체를 한 번만 생성. string은 자료형을 계속 생성한다.
        // stringBuffer는 메모리 사용량도 많고 무겁지만, 문자열을 추가하거나 변경하는 작업이 많다면 쓰면 유리하다.

        StringBuilder sb2 = new StringBuilder();
        sb2.append("hello");
        sb2.append(" ");
        sb2.append("jump to java");
        String result3 = sb2.toString();
        System.out.println(result3);

        // 위의 결과도 같지만 stringBuffer에 비해 성능이 우수하다.
        // StringBuffer는 멀티 스레드 환경에서 안전하므로 동기화가 없는 환경에선 stringBuilder를 쓰자.

        // insert
        StringBuffer sb3 = new StringBuffer();
        sb3.append("jump to java");
        sb3.insert(0, "hello ");
        System.out.println(sb3.toString());

        //substring
        StringBuffer sb4 = new StringBuffer();
        sb4.append("Hello jump to java");
        System.out.println(sb4.substring(0, 4));
    }
}