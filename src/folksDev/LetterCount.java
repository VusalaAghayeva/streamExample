package folksDev;

import java.util.Arrays;

public class LetterCount {
    public static void main(String[] args) {
        getTotalNumberOfLettersOfNamesLongerThanFive("Aghjdhjbj","Bdjcbsdghjsdbj","cmsdkjn");

    }


    public static int getTotalNumberOfLettersOfNamesLongerThanFive(String...names){

        //Array elemanlarini al
        //5 den uzun isimleri filtrle
        //geri kalan listedeki butun herflerin sayini getir
        //hwerf saylarini topla
        return Arrays.stream(names)
                .filter(name->name.length()>5)
                .mapToInt(String ::length)
                .sum();


    }
}
