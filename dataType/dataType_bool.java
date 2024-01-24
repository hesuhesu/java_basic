public class dataType_bool {
    public static void main(String[] args) {
        boolean isSuccess = true;
        boolean isTest = false;

        int base = 180;
        int height = 185;
        boolean isTall = height > base;

        if (isTall) {
            System.out.println("키가 큽니다.");
        }

        int i = 3;
        boolean isOdd = i % 2 == 1; // 해당 식의 나머지가 1인지 묻는 조건문.
        System.out.println(isOdd);  // true 출력

    }
}