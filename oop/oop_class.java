package oop;

class Animal {
    String name; // 객체 변수는 인스턴스 변수, 멤버 변수, 속성이라고도 함.

    public void setName(String name){ // 메서드. 클래스 내에 구현된 함수이다.
        this.name = name; //
    }
}

public class oop_class {
    public static void main (String[] args){

        Animal cat = new Animal();
        Animal dog = new Animal();
        Animal horse = new Animal();

        System.out.println(cat.name); // 아무것도 할당 안되었기 때문에 null.

        cat.setName("boby");  // 메서드 호출
        System.out.println(cat.name); // 할당되어 변수값이 변경되었으므로 boby 이다.

        dog.setName("happy");
        System.out.println(dog.name);

        // 클래스의 장점은 객체 변수의 값이 독립적으로 유지된다
    }
}
