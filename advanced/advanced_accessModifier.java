package advanced;

class test {
    String name; // 별도로 설정하지 않는다면 default 접근제어자.
    public String mention = "hello"; // 어느곳이든 접근 가능.
    private void setName(String str){
        this.name = str;
    }
    // private이 붙은 변수나 메서드는 해당 클래스 안에서만 접근이 가능하다.
    private String getName(String str){
        return name;
    }
}

public class advanced_accessModifier {
    public static void main (String[] args){
        test ts = new test();
        // ts.setName(); 는 접근 불가능하다. 이유는 private 접근제어자이기 때문.
        System.out.println(ts.name);
        System.out.println(ts.mention);

        // private = private 가 붙은 변수나 메서드는 해당 클래스 내에서만 접근 가능
        // default = 추가 설정이 없으면 default 로 설정. 동일 패키지 내에서만 접근 가능.
        // protected = 동일 패키지의 클래스 또는 클래스를 상속받은 클래스에서만 접근 가능.
        // -> 다른 패키지에 존재해도 상속받는다면 접근 가능하다.
        // public = 걍 다 됨.

        // public 으로 사용하면 다 되지만, 남용하여 실수하지 않도록 유의.
    }
}
