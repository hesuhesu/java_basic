package oop;

interface Predator2 { //
    String getFood();

    default void printFood() { // default method. 디폴트 메서드는 메서드명 가장 앞에 default라고 표기해야 한다.
        System.out.printf("my food is %s\n", getFood());
    }
}
interface Barkable {
    void bark();
}
interface BarkablePredator extends Predator, Barkable {
}
class Animal4 {
    String name;

    void setName(String name) {
        this.name = name;
    }
}

class Tiger2 extends Animal4 implements BarkablePredator {
    public String getFood() {
        return "apple";
    }
    public void bark() {
        System.out.println("어흥");
    }
}

class Lion2 extends Animal4 implements BarkablePredator {
    public String getFood() {
        return "banana";
    }
    public void bark() {
        System.out.println("으르렁");
    }
}

class ZooKeeper2 { // ZooKeeper 클래스가 동물 클래스에 의존적인 클래스에서 동물 클래스와 상관없는 독립적인 클래스가 되었다.
    void feed(Predator2 predator) { // 즉, ‘Tiger is a Predator’, ‘Lion is a Predator’가 성립된다.
        System.out.println("feed "+predator.getFood());
    }
}

class Bouncer {
    void barkAnimal(Barkable animal) {  // Animal 대신 Barkable을 사용
        animal.bark();
    }
}

public class oop_polymorphism {
    public static void main (String[] args){

        Tiger2 tiger = new Tiger2();
        Lion2 lion = new Lion2();

        Bouncer bouncer= new Bouncer();
        bouncer.barkAnimal(tiger);
        bouncer.barkAnimal(lion);

        // 하나의 객체가 여러 개의 자료형 타입을 가질 수 있는 것을 객체 지향 세계에서는 다형성이라고 한다.
        // 자식 인터페이스로 생성한 객체의 자료형은 부모 인터페이스로 사용하는 것이 가능하다.
    }
}
