package practice;

import java.util.List;
import java.util.SplittableRandom;

public class UserService {
    private List<User> userList;

    public void register(String username,
                         String password,
                         String name,
                         String email,
                         String phone,
                         String address,
                         int age,
                         List<String> roles) {
        userList.stream()
                .filter(user -> user.getUsername().equals(username))
                .findAny()
                .ifPresentOrElse(user ->
                                System.out.println("이미 존재하는 User정보입니다. 찾은 정보 -> " + user),
                                     () -> userList.add(new User(username, password, name, email, phone, address, age, roles)));
    }

    public void printAll() {
        userList.forEach(System.out::println);
    }
}
