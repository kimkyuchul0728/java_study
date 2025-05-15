package loop;

import java.util.List;

public class Main4 {
    public static void main(String[] args) {
        // 학생들 중 가장 점수가 높은 학생의 이름을 출력하시오.
        List<Student> students = List.of(
                new Student("김준일", 80),
                new Student("김준이", 94),
                new Student("김준삼", 75),
                new Student("김준사", 99),
                new Student("김준오", 85)
        );
        Student maxStudent = null;
        for (Student s : students) {
            if (maxStudent == null) {
                maxStudent = s;
            }else {
                if (maxStudent.getScore() < s.getScore()) {
                    maxStudent = s;
                }
            }
        }
        if (maxStudent == null) {
            return;
        }
        System.out.println(maxStudent.getName());
    }
}
