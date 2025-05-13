package classStudy;

import java.util.ArrayList;
import java.util.List;
import java.util.SplittableRandom;

// 변수를 설정할 수 없음 상수임 -> 대입 안됌    static final 생략과 같음. -> 상수며 클래스를 생성하징 않아도 부를 수 있다.
//interface UserService {
//    String userType = "관리자";
//}


// 싱글톤
class UserAndAdminRepository {
    List<User> userList = new ArrayList<>();
    private static UserAndAdminRepository instance;

    private UserAndAdminRepository() {

    }

    static UserAndAdminRepository getInstance() {
        if (instance == null) {
            instance = new UserAndAdminRepository();
        }
        return instance;
    }

    void insert() {
        userList.add(new User());
        System.out.println("사용자 또는 관리자 정보 추가");
    }

    void delete() {
        userList.remove(new User());
        System.out.println("사용자 또는 관리자 정보 삭제");
    }
}

class AdminService {
    void addAdmin() {
        UserAndAdminRepository.getInstance().insert();
    }
    void removeAdmin() {
        UserAndAdminRepository.getInstance().delete();
    }
}

class UserService {
    void addUser() {
        UserAndAdminRepository.getInstance().insert();
    }
    void removeUser() {
        UserAndAdminRepository.getInstance().delete();
    }
}

class User {
    // 클래스명만 알면 스태틱은 어디서나 접근할 수 있다. User를 생성하지 않더라도 접근 가능하다.
    static String userType = "사용자";
    String username = "user1";
    String password = "pw1";
}

public class Main {
    public static void main(String[] args) {
//        username = "testuser1";
//        password = "1234";
//        username = "testuser2";
//        password = "1111";

        String username1 = "testuser1";
        String password1 = "1234";
        String username2 = "testuser2";
        String password2 = "1111";

        // 자바스크립트 형식
//        user1 = {
//                username: "testuser1",
//                password: "1234"
//        };
//        user2 = {
//                username: "testuser2",
//                password: "1111"
//        };
//
        // 자바식
        new User().username = "testuser1";      // 아래식과 서로 다른 객체
        new User().password = "1111";           // 한번 쓰고 안 쓸거면 이래 써도 됨.
        User u = new User();                    // u가 주소를 저장함. 새로운 User 라는 객체를 생성하고 그 주소를 u에 저장
        u.username = "testuser2";               // 아래식과 같은 객체
        u.password = "1234";

        User.userType = "관리자";
//        u.userType        <- 스태틱은 공유를 하기에 userType은 관리자, 스태틱은 하나밖에 없음.

        AdminService adminService = new AdminService();
        UserService userService = new UserService();

    }

}
