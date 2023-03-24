package folksDev;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SumAndReduce {
    public static void main(String[] args) {

    }

//    public static int calculate(List<Integer> list) {
//        int total = 0;
//        for (int number : list) {
//            total += number;
//        }
//        return total;
//    }

    public static int calculate2(List<Integer> numbers) {
        return numbers.stream().reduce((i,sum)->i+sum).orElse(0);


    }


}