package oop;

class Dog2 extends Animal2 {
    void sleep() {
        System.out.println(this.name + " zzz");
    }
}

class HouseDog2 extends Dog2 {

    HouseDog2(){ // default 생성자. 공백 생성 시 적용됨.

    }
    HouseDog2(String name) { // 생성자. 설정하지 않으면 생성되지 않음.
        System.out.println(name + " 이 생성되었습니다!");
        this.setName(name);
    }
    HouseDog2(int type) { // 생성자 오버로딩. 다른 자료형의 입력을 받아서 다른 선택지를 호출한다.
        System.out.println(type + " 가 호출되었습니다!");
        if (type == 1) {
            this.setName("yorkshire");
        } else if (type == 2) {
            this.setName("bulldog");
        }
        else {
            this.setName("잡종");
        }
    }
    void sleep() {
        System.out.println(this.name + " zzz in house");
    }

    void sleep(int hour) {
        System.out.println(this.name + " zzz in house for " + hour + " hours");
    }
}

public class oop_constructor {
    public static void main (String[] args){
        HouseDog2 dog = new HouseDog2("poppy"); // 생성자가 존재하므로 공백 생성 시 디폴트 생성자로 넘어감.
        HouseDog2 dog2 = new HouseDog2(1);
        HouseDog2 dog3 = new HouseDog2(5);

        System.out.println("\n생성된 개 이름 : ");
        System.out.println(dog.name);
        System.out.println(dog2.name);
        System.out.println(dog3.name);
        // 생성자 규칙
        // 생성자는 메서드명이 클래스와 동일.
        // 리턴 타입을 정의하지 않는다. void 사용 x
        // 생성자는 객체가 생성될 때 호출된다. new 키워드가 사용될 때 호출


    }
}