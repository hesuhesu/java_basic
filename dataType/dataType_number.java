package dataType;

public class dataType_number {
    public static void main(String[] args) {
        
        // 정수
        int age = 10;
        long countOfStar = 8764827384923849L; // int 범위를 넘어선 수에 L 없으면 오류.
        
        // 실수
        float pi = 3.14F;
        double morePi = 3.14159265358979323846;
        double d1 = 123.4;
        double d2 = 1.234e2; // 1.234 * 10^2로 보면 됨.
        
        // 8진수와 16진수
        int octal = 023;    // 십진수: 19
        int hex = 0xC;     // 십진수: 12

        System.out.println("7 % 3 은 : " + (7%3));

        int i = 0;
        int j = 10;
        i++;
        j--;

        System.out.println("증감 연산 후 i 값 : " + i);
        System.out.println("증감 연산 후 j 값 : " + j);


    }
}