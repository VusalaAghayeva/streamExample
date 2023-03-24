package folksDev;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class User {
    Integer id;
    String name;

    public User(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public void talk(){
        System.out.println("Hi , i am "+this.name);
    }

}

 class NewFeatures{
     public static void main(String[] args) {

     List<User> users = new ArrayList<>();
        users.add(new User(1, "Vusala"));
        users.add(new User(2, "Sevinc"));
        users.add(new User(3, "Arzu"));
        users.add(new User(4, "Tamella"));
        users.add(new User(5, "Tahmina"));


        users.stream()
                .forEach(user -> {
         System.out.println("Java 8");
         System.out.println(user.toString());
     });

        users.stream().forEach(User::talk); //method reference

     List<User> lists = users.stream().filter(user -> user.id > 1).collect(Collectors.toList());
        System.out.println(lists);

     long count = users.stream().filter(user -> user.id > 1).count();
        System.out.println(count);


     List<User> mappedList1=users.stream()
             .map(user -> new User(user.id+100,user.name))
             .collect(Collectors.toList());
        System.out.println(mappedList1);

     List<User> mappedList2 = new ArrayList<>();
        for (User user : users) {
            User user1 = new User(user.id + 100, user.name);
            mappedList2.add(user1);

            Map<Integer, String> map = users.stream().collect(Collectors.toMap(userx -> user.id, userx -> user.name));
            map.forEach((key, value) -> System.out.println(key + ":" + value));


            // given list
            List<String> namesList = Arrays.asList("Vusala", "Tamilla", "Narmin", "Tahmina");

            List<String> filteredNames = namesList.stream() //convert list to stream
                    .filter(name -> name.startsWith("T"))    //find which is startWith T
                    .collect(Collectors.toList());    // collect and convert stream to list
            filteredNames.forEach(System.out::println);
        }}
     }

