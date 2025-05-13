package oop;

public class BasicUserService {

    // 객체에서의 다운캐스팅 제한사항 본래의 객체로만 돌아갈 수 있다.
    private UserRepository userRepository;         // 업캐스팅
//    private CustomUserRepository userRepository2 = (CustomUserRepository)userRepository;        // 다운캐스팅
//    private BasicUserRepository userRepository2 = (BasicUserRepository)userRepository;        // 다운캐스팅

    public BasicUserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void addUser() {
        System.out.println("기본 사용자 추가");
        userRepository.insert();
    }

}
