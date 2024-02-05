package controlStatement;

import java.util.ArrayList;
import java.util.Arrays;

public class controlStatement_forEach {
    public static void main (String[] args){

        String[] numbers = {"one", "two", "three"};
        for(String number: numbers) {
            System.out.println(number); // python 문법처럼 해당 iterate에 대한 내용을 출력 가능함.
        }

        ArrayList<String> numbers2 = new ArrayList<>(Arrays.asList("one", "two", "three"));
        for (String number : numbers2) {
            System.out.println(number);
        }
    }
}
