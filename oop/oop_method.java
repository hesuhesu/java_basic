package oop;

public class oop_method {

    int sum(int a, int b) { // a,b는 매개 변수
        return a + b;
    }
    void sayNick(String nick) {
        if ("바보".equals(nick)) {
            return; // 단독으로 사용하여 매서드를 빠진다.
        }
        System.out.println("나의 별명은 "+nick+" 입니다.");
    }

    void varTest(int a) {
        a++;
    }
    int varTest2(int a) {
        a++;
        return a;
    }

    int b;  // 객체변수 a
    void varTest3(oop_method sample) {
        sample.b++;
    }
    void varTest4(){ // 굳이 oop_method 객체를 전달하지 않아도 this로 호출 가능.
        this.b++;
    }

    public static void main (String[] args){
        oop_method sample = new oop_method();
        int c = sample.sum(3, 4);  // 3, 4는 인수

        System.out.println(c);

        /*
        매서드 구조 :
        리턴자료형 메서드명(입력자료형1 매개변수1, 입력자료형2 매개변수2, ...) {
        ...
        return 리턴값;  // 리턴자료형이 void 인 경우에는 return 문이 필요없다.
        }*/

        System.out.println("--------------------------------");

        oop_method sayName = new oop_method();
        sayName.sayNick("야호");
        sayName.sayNick("바보");  // 출력되지 않는다.

        System.out.println("--------------------------------");

        int a = 1;
        oop_method upNum = new oop_method();
        upNum.varTest(a); // 매서드 안에서만 됨. 변경 x
        System.out.println(a);

        a = upNum.varTest2(a); // 기존 a를 varTest2 메서드에 삽입하면 해당하는 값을 반환해준다.
        System.out.println(a);

        System.out.println("--------------------------------");

        oop_method upNum2 = new oop_method();
        upNum2.b = 1;
        upNum2.varTest3(upNum2);
        System.out.println(upNum2.b);

        upNum2.varTest4();
        System.out.println(upNum2.b);
    }
}
