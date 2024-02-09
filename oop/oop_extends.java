package oop;

class Animal2 { // extends Object
    String name;

    void setName(String name) {
        this.name = name;
    }
}
class Dog extends Animal2 {
    void sleep() {
        System.out.println(this.name+" zzz");
    }
}
class HouseDog extends Dog {
    void sleep() {
        System.out.println(this.name + " zzz in house");
    }
    void sleep(int hour) { // method overloading
        System.out.println(this.name+" zzz in house for " + hour + " hours");
    }
}
public class oop_extends {
    public static void main (String[] args){

        Dog dog = new Dog();
        dog.setName("poppy");
        System.out.println(dog.name);
        dog.sleep();

        // IS-A 관계란?
        // Dog 클래스는 Animal 클래스를 상속했다. 즉, Dog는 Animal의 하위 개념이라고 할 수 있다.
        // 이런 경우 Dog는 Animal에 포함되기 때문에 ‘개(Dog)는 동물(Animal)이다’라고 표현할 수 있다.

        // Dog dog = new Animal2();  // 컴파일 오류
        Animal2 dog2 = new Dog();  // Dog is a Animal

        // Object를 상속받기 때문에 이러한 적용도 가능함.
        // Object animal = new Animal2();  // Animal is a Object
        // Object dog = new Dog();  // Dog is a Object

        // method overriding
        HouseDog houseDog = new HouseDog();
        houseDog.setName("happy");
        houseDog.sleep();  // happy zzz in house 출력
        houseDog.sleep(3);

        // method overriding => 메서드 덮어쓰기.
        // method overloading => 동일명 메서드 추가하기.
        // 자바는 다중 상속이 안된다. 
        // 다중 상속 시 다른 클래스 동일명 메서드가 존재한다면 어떤 것을 실행해야하는지 모호함
        // 불분명한 부분을 없앤 언어 => java
    }
}
