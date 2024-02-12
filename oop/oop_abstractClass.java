package oop;

abstract class Predator3 extends  Animal5 {
    abstract String getFood();

    void printFood() { // default method. 디폴트 메서드는 메서드명 가장 앞에 default라고 표기해야 한다.
        System.out.printf("my food is %s\n", getFood());
    }
}
interface Barkable2 {
    void bark();
}
class Animal5 {
    String name;

    void setName(String name) {
        this.name = name;
    }
}
class Tiger3 extends Predator3 implements Barkable2 {
    public String getFood() {
        return "apple";
    }
    public void bark() {
        System.out.println("어흥");
    }
}
class Lion3 extends Predator3 implements Barkable2 {
    public String getFood() {
        return "banana";
    }
    public void bark() {
        System.out.println("으르렁");
    }
}
class ZooKeeper3 { // ZooKeeper 클래스가 동물 클래스에 의존적인 클래스에서 동물 클래스와 상관없는 독립적인 클래스가 되었다.
    void feed(Predator3 predator) { // 즉, ‘Tiger is a Predator’, ‘Lion is a Predator’가 성립된다.
        System.out.println("feed "+predator.getFood());
    }
}
class Bouncer2 {
    void barkAnimal(Barkable2 animal) {  // Animal 대신 Barkable을 사용
    animal.bark();
    }
}
public class oop_abstractClass {
    public static void main (String[] args){

        Tiger3 tiger = new Tiger3();
        Lion3 lion = new Lion3();

        Bouncer2 bouncer = new Bouncer2();
        bouncer.barkAnimal(tiger);
        bouncer.barkAnimal(lion);

        // 추상 클래스를 만들려면 class 앞에 abstract를 표기해야 한다.
        // 추상 클래스는 일반 클래스와 달리 단독으로 객체를 생성할 수 없다.
        // 반드시 추상 클래스를 상속한 실제 클래스를 통해서만 객체를 생성할 수 있다.

    }
}