package oop;

class Calculator1 {
    static int result = 0;

    static int add(int num) {
        result += num;
        return result;
    }
}
class Calculator2 {
    static int result = 0;

    static int add(int num) {
        result += num;
        return result;
    }
}
class Calculator {
    int result = 0;

    int add(int num) {
        result += num;
        return result;
    }
    int sub(int num) {
        result -= num;
        return result;
    }
}

public class oop_basic {
    public static void main (String[] args){

        System.out.println(Calculator1.add(3)); // 정적 함수는 객체 생성 없이 출력 가능하다.
        System.out.println(Calculator1.add(4));

        System.out.println(Calculator2.add(3));
        System.out.println(Calculator2.add(7));

        // 객체를 계속 생성하기 위해선 정적 class 를 계속 생산하기 보다 하나의 틀을 잡는게 중요하다.
        Calculator cal1 = new Calculator();  // 계산기1 객체를 생성한다.
        Calculator cal2 = new Calculator();  // 계산기2 객체를 생성한다.

        System.out.println("객체 생성 됨!!");
        System.out.println("cal1 덧셈 계산!");
        System.out.println(cal1.add(3));
        System.out.println(cal1.add(4));

        System.out.println("cal2 덧셈 계산!");
        System.out.println(cal2.add(3));
        System.out.println(cal2.add(7));

        System.out.println("cal1 뺄셈 계산!");
        System.out.println(cal1.sub(4));
        System.out.println(cal1.sub(3));

        System.out.println("cal1 뺄셈 계산!");
        System.out.println(cal2.sub(7));
        System.out.println(cal2.sub(3));
    }
}