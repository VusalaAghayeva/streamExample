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

}
