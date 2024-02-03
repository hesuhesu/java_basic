public class controlStatement_switch {
    public static void main (String[] args){

        int month = 8;
        String monthString = "";

        switch (month) {  // 입력 변수의 자료형은 byte, short, char, int, enum, String만 가능하다.
            case 1:  monthString = "January";
                break;
            case 2:  monthString = "February";
                break;
            case 3:  monthString = "March";
                break;
            case 4:  monthString = "April";
                break;
            case 5:  monthString = "May";
                break;
            case 6:  monthString = "June";
                break;
            case 7:  monthString = "July";
                break;
            case 8:  monthString = "August";
                break;
            case 9:  monthString = "September";
                break;
            case 10: monthString = "October";
                break;
            case 11: monthString = "November";
                break;
            case 12: monthString = "December";
                break;
            default: monthString = "Invalid month";
                break;
        }
        System.out.println(monthString);
        // 이와 같이 입력값이 정형화되어 있는 경우 if 문보다는 switch/case 문을 쓰는 것이 코드의 가독성이 좋다.
    }
}