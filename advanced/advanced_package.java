package advanced;
import advanced.practice_package.*;

public class advanced_package {
    public static void main (String[] args){

        practice h1 = new practice();
        practice_2 h2 = new practice_2();

        // 동일 패키지 안에선 클래스 사용 시 import 가 필요없다.
        // 패키지 안에 서브 패키지를 생성 가능하다.
        // 클래스를 다른데서 가져오려면 import 를 해야한다.
    }
}