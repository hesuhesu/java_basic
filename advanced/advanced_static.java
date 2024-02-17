package advanced;

import java.text.SimpleDateFormat;
import java.util.Date;

class House {
    String name = "lee";
}
class House2 {
    static String name = "mike";
}
class Counter  {
    static int count = 0;
    Counter() {
        count++;
        System.out.println(count);
    }
    public static int getCount() {
        return count;
    }
}
class Util {
    public static String getCurrentDate(String fmt) {
        SimpleDateFormat sdf = new SimpleDateFormat(fmt);
        return sdf.format(new Date());
    }
}
class Singleton {
    // 클래스를 통해 생성할 수 있는 객체가 한 개만 되도록 만드는 것이 싱글톤이다.
    private static Singleton one;
    private Singleton() {
    }

    public static Singleton getInstance() {
        if(one==null) { // 최초 실행 시 one 값이 생성됨.
            one = new Singleton();
        }
        return one; // 이 후 one 값은 null 이 아니므로 상시 같은 객체를 반환함.
    }
}
public class advanced_static {
    public static void main(String[] args) {

        House man1 = new House();
        House man2 = new House();
        // 객체마다 객체 변수 name 을 저장하기 위한 메모리가 별도 할당.

        House2 man3 = new House2();
        // static 키워드를 붙이면 한 번만 메모리 할당하여 메모리 사용량을 감소 가능하다.
        // static 은 값을 공유할 수 있다.

        Counter c1 = new Counter();
        Counter c2 = new Counter();
        // static 변수 count 는 객체별로 할당이 아니기 때문에 값이 올라감.

        System.out.println(Counter.getCount());  // 스태틱 메서드는 클래스를 이용하여 호출
        // 다른 객체 변수를 불러오려면 오류가 뜸. static 변수 호출이기에 가능.
        System.out.println("------------------------------");

        System.out.println(Util.getCurrentDate("yyyyMMdd"));  // 오늘 날짜 출력
        System.out.println("------------------------------");

        // singleton 패턴

        // Singleton singleton = new Singleton();  // 컴파일 오류가 발생한다.
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        System.out.println(singleton1 == singleton2);  // true 출력
        System.out.println("------------------------------");
    }
}