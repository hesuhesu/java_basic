package oop;

interface Predator { //
    String getFood();

    default void printFood() { // default method. 디폴트 메서드는 메서드명 가장 앞에 default라고 표기해야 한다.
        System.out.printf("my food is %s\n", getFood());
    }
}
class Animal3 {
    String name;

    void setName(String name) {
        this.name = name;
    }
}

class Tiger extends Animal3 implements Predator {
    public String getFood() {
        return "apple";
    }
}

class Lion extends Animal3 implements Predator {
    public String getFood() {
        return "banana";
    }
}

class ZooKeeper { // ZooKeeper 클래스가 동물 클래스에 의존적인 클래스에서 동물 클래스와 상관없는 독립적인 클래스가 되었다.
    void feed(Predator predator) { // 즉, ‘Tiger is a Predator’, ‘Lion is a Predator’가 성립된다.
        System.out.println("feed "+predator.getFood());
    }
}

public class oop_interface {
    public static void main (String[] args){

        ZooKeeper zooKeeper = new ZooKeeper();
        Tiger tiger = new Tiger();
        Lion lion = new Lion();
        zooKeeper.feed(tiger);  // feed apple 출력
        zooKeeper.feed(lion);  // feed banana 출력

        /*
        Predator 인터페이스 대신 Animal 클래스에 getFood 메서드를 추가하고 Tiger, Lion 등에서 getFood 메서드를 오버라이딩한 후 Zookeeper의 feed 메서드가 Predator 대신 Animal을 입력 자료형으로 사용해도 동일한 효과를 거둘 수 있다.
        하지만 상속은 자식 클래스가 부모 클래스의 메서드를 오버라이딩하지 않고 사용할 수 있기 때문에 해당 메서드를 반드시 구현해야 한다는 ‘강제성’을 갖지 못한다. 그래서 상황에 맞게 상속을 사용할 것인지, 인터페이스를 사용해야 할지를 결정해야 한다.
        인터페이스는 인터페이스의 메서드를 반드시 구현해야 하는 강제성을 갖는다는 점을 반드시 기억하자.*/

    }
}