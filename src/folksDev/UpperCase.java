package folksDev;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Scanner;
import java.util.stream.Collectors;

public class UpperCase {
    public static void main(String[] args) {
        System.out.println("entering ...");
        Scanner sc=new Scanner(System.in);
        String names=sc.nextLine();
        System.out.println(mapToUppercase(names));
    }

    public static Collection<String> mapToUppercase(String...names){
        Collection<String> uppercaseNames=new ArrayList<>();
        for (String name:names){
            uppercaseNames.add(name.toUpperCase());
        }
        return uppercaseNames;
    }



    public static Collection<String> mapToUppercase2(String...names) {
     return  Arrays.stream(names).map(name->name.toUpperCase()).collect(Collectors.toList());

    }


    public static Collection<String> mapToUppercase3(String...names) {
        return  Arrays.stream(names).map(String::toUpperCase).collect(Collectors.toList());

    }
}
