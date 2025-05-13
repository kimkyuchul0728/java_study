package oop;

public class Main {

    public static void main(String[] args) {
//        UserRepository userRepository = new BasicUserRepository();
        BasicUserService userService = new BasicUserService(new CustomUserRepository());    // 의존성 주입

        userService.addUser();


    }
}
