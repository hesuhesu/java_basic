package IO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class IO_console {
    public static void main (String[] args) throws IOException {

        // InputStream
        InputStream in = System.in; // System.in은 InputStream 의 객체이다.

        int a; // InputStream 의 read 메서드는 1byte 크기의 사용자의 입력을 받아들인다.
        a = in.read(); // read 는 int 자료형으로 저장되고, 0~255 사이 정수값. 즉 아스키코드 값이다.

        System.out.println(a);
        System.out.println("----------------------------");

        InputStream in2 = System.in;

        int a1, b1, c1; // 이런 식으로 3글자를 받아올 수 있음.
        a1 = in.read();
        b1 = in.read();
        c1 = in.read();

        System.out.println(a1);
        System.out.println(b1);
        System.out.println(c1);
        System.out.println("----------------------------");

        InputStream in3 = System.in;

        byte[] a2 = new byte[3]; // 3글자 받기를 좀 더 간소화 가능.
        in.read(a2);

        System.out.println(a2[0]);
        System.out.println(a2[1]);
        System.out.println(a2[2]);
        System.out.println("----------------------------");

        // InputStreamReader

        InputStream in4 = System.in;
        InputStreamReader reader = new InputStreamReader(in4);
        // InputStreamReader 는 객체를 생성할 때 생성자의 입력으로 InputStream 객체가 필요하다.
        char[] a3 = new char[3]; // InputStreamReader 를 이용하면 다음처럼 byte 대신 char 배열을 사용할 수 있다.
        reader.read(a3);

        System.out.println(a3); // 한 번에 출력된다.
        System.out.println("----------------------------");

        InputStream in5 = System.in;
        InputStreamReader reader2 = new InputStreamReader(in5);
        // BufferedReader 의 readLine 메서드를 이용하면 사용자가 입력한 문자열 전부를 읽을 수 있게 된다.
        BufferedReader br = new BufferedReader(reader2);

        String a4 = br.readLine();
        System.out.println(a4);
        System.out.println("----------------------------");

        Scanner sc = new Scanner(System.in);
        System.out.println(sc.next());
        // Scanner 객체의 next() 메서드는 한 개의 토큰(token)을 읽어 들인다.
        // next: 토큰을 읽어 들일 수 있다.
        // nextLine: 라인을 읽어 들일 수 있다.
        // nextInt: 정수를 읽어 들일 수 있다.
        // 토큰은 정보의 최소 단위로, 문법적으로 의미가 있는 문자열을 의미한다. 일반적으로 공백으로 구분되는 단어나 숫자, 기호 등이 토큰에 해당된다.

         /*
         결론 :
         InputStream: byte 를 읽는다.
         InputStreamReader: character(문자)를 읽는다.
         BufferedReader: String(문자열)을 읽는다.
         Scanner 도 좋지만 시간 복잡도 면에선 BufferReader 를 쓰는게 현명하다.
         */
    }
}