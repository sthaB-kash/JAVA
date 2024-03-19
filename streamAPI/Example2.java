package streamAPI;


import java.util.List;
import java.util.ArrayList;

public class Example2 {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        users.add(new User(1, 24, "Bikash Shrestha", "Kathmandu"));
        users.add(new User(2, 23, "Shrestha Bikash", "Bharatpur"));
        users.add(new User(3, 21, "Christina Shrestha", "Satungal"));
        users.add(new User(4, 24, "Kiran Pandey", "Kalanki"));
        users.add(new User(5, 23, "Nabina Khadka", "Bhaktapur"));

        users.stream().filter(user -> user.getAge() >= 24)
                .map(user -> user.getName().toUpperCase())
                .sorted()
                .forEach(System.out::println);//.forEach(user -> System.out.println(user));
    }
}


class User {
    private String name, address;
    private Integer id, age;

    public User(Integer id, Integer age, String name, String address) {
        this.name = name;
        this.address = address;
        this.id = id;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", id=" + id +
                ", age=" + age +
                '}';
    }
}