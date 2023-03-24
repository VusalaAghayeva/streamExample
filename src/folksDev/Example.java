package folksDev;
import java.util.Arrays;
import java.util.List;

public class Example {
    public static void main(String[] args) {

        //1.
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        list.stream()
                .filter(i->i%2==0)
                .forEach(i-> System.out.println(i+1));  //3,5,7

        //2.
        List<Integer> list1= Arrays.asList(2,4,5,6,8,10,11,13);

        list.stream()
                .filter(n-> n%2==1)
                .sorted()
                .map(n->n*2)
                .forEach(x-> System.out.println(x));   //10,22,26


    }
}