package advanced;

import java.io.FileNotFoundException;

class FoolException extends Exception {
}
public class advanced_exception {
    public void shouldBeRun() {
        System.out.println("ok thanks");
    }
    public void sayNick(String mention) throws FoolException {
        // throws FoolException 을 발생함으로서 예외 미루기가 가능함.
        // 밑의 try catch 주석에 있는 명령어와 비슷한 기능.
        if("hello".equals(mention)) {
            throw new FoolException();
        }
        System.out.println("당신은 "+mention+" 이라 말했습니다.");
        /*try {
            if("hello".equals(mention)) {
                throw new FoolException();
            }
            System.out.println("당신은 "+mention+" 이라 말했습니다.");
        } catch(FoolException e){
            System.err.println("FoolException 이 발생했습니다.");
        }*/
    }
    public static void main (String[] args) throws FileNotFoundException {

        // FileNotFoundException
        // BufferedReader br = new BufferedReader(new FileReader("나없는파일"));
        // br.readLine();
        // br.close();

        // ArithmeticException
        // int b = 4 / 0;

        // ArrayIndexOutOfBoundsException
        // int[] a = {1, 2, 3};
        // System.out.println(a[3]);

        // try-catch 예외처리
        advanced_exception sample = new advanced_exception();
        int c;
        try {
            c = 4 / 0;
        } catch(ArithmeticException e) {
            c = -1;  // 예외가 발생하여 이 문장이 수행된다.
        } finally {
            sample.shouldBeRun();  // 예외에 상관없이 무조건 수행된다.
        }

        // 예외 활용
        try {
            sample.sayNick("fine thanks");
            sample.sayNick("hello"); // hello 일 경우 메서드를 종료해 mention 뜨지 않음.
            sample.sayNick("hi~");
            // 해당 sayNick 메서드는 FoolException 을 던져서 main 으로 넘어왔기 때문에 해당 예외처리를 해줘야함.
        } catch (FoolException e){
            System.err.println("FoolException 이 발생했습니다.");
        }

        // transaction : 트랜잭션. 하나의 작업 단위를 의미

        // 결론
        // 예외처리의 위치를 자세히 파악하자.
    }
}