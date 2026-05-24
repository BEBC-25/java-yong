package ch07;

import java.util.Scanner;

// [문제] 시험 점수(score)에 따른 학점을 출력하는 코드를 작성하세요.
// 학점 기준:
// - 90점 이상 ~ 100점 이하: A
// - 80점 이상 ~ 89점 이하: B
// - 70점 이상 ~ 79점 이하: C
// - 60점 이상 ~ 69점 이하: D
// - 0점 이상 ~ 59점 이하: F
// - 그 외의 점수 (음수이거나 100점을 초과하는 경우): "올바르지 않은 점수입니다." 출력
public class IfSolve {
    public static void main(String[] args) {
        int score = 189;

        String result = "F";

        // 이곳에 코드를 작성하세요.
        if(score < 0 || score > 100){
            result = "올바르지 않은 점수입니다.";
        }else{
            if(score >= 90 && score <= 100){ // 만약 score가 90점 이상, 그리고 100점 이하라면 ...
                result = "A";
            }else if(score >= 80){ // 그렇지 않고 만약 score가 80점 이상이라면 ...
                result = "B";
            }else if(score >= 70){ // 그렇지 않고 만약 score가 70점 이상이라면 ...
                result = "C";
            }else if(score >= 60){ // 그렇지 않고 만약 score가 60점 이상이라면 ...
                result = "D";
            }else{ // 그렇지 않고 만약 score가 0점 이상, 그리고 59점 이하라면 ...
                result = "F";
            }
        }


        System.out.println((result));

        // 이승언님
        System.out.println("이승언님");
        String grade;
        if(score >= 0 && score <= 100){
            if(score >= 90){
                grade = "A";
            } else if (score >= 80) {
                grade = "B";
            } else if (score >= 70) {
                grade = "C";
            } else if (score >= 60) {
                grade = "D";
            } else {
                grade = "F";
            }
            System.out.println("학점은 : " + grade);
        }else{
            System.out.println("올바르지 않은 점수입니다.");
        }

        // 김두희님
        System.out.println("김두희님");
        if (score > 100 || score < 0) {
            System.out.println("올바르지 않은 점수입니다.");
//            return ; // 메서드 수행 종료
        }

        grade = "";
        if (score >= 90) {
            grade = "A";
        }
        else if (score >= 80) {
            grade = "B";
        }
        else if (score >= 70) {
            grade = "C";
        }
        else if (score >= 60) {
            grade = "D";
        }
        else {
            grade = "F";
        }
        System.out.println("학점: " + grade);

        // 이원준님
        System.out.println("이원준님");
        if(score < 0 || score > 100) {
            System.out.println("올바르지 않은 점수입니다.");
        } else if(score >= 90 && score <= 100) {
            System.out.println("A");
        } else if(score >= 80 && score <= 89) {
            System.out.println("B");
        } else if(score >= 70 && score <= 79) {
            System.out.println("C");
        } else if(score >= 60 && score <= 69) {
            System.out.println("D");
        } else if(score < 60){
            System.out.println("F");
        }

        // 정승우님
        System.out.println("정승우님");
        if (score > 100 || score < 0){
            System.out.println("올바르지 않은 점수입니다.");
        } else if (score >= 90) {
            System.out.println("Your score is A");
        } else if (score >= 80) {
            System.out.println("Your score is B" );
        } else if (score >= 70) {
            System.out.println("Your score is C" );
        } else if (score >= 60) {
            System.out.println("Your score is D");
        } else {
            System.out.println("Your score is F");
        }

        // 김병호님
        System.out.println("김병호님");
        char grade2 = 'F';
        if (score < 0 || score > 100) {
            System.out.println("올바르지 않은 점수입니다.");
        } else {
            if (score >= 90) {
                grade2 = 'A';
            } else if (score >= 80) {
                grade2 = 'B';
            } else if (score >= 70) {
                grade2 = 'C';
            } else if (score >= 60) {
                grade2 = 'D';
            }

            System.out.println(grade2);
        }

        // 박병찬님
        System.out.println("박병찬님");
        if (score > 100 || score < 1 ) {
            System.out.println("올바르지 않는 점수입니다.");

        } else if (score <= 59) {
            System.out.println("F");

        } else if (score <= 69) {
            System.out.println("D");

        } else if (score <= 79) {
            System.out.println("C");

        } else if (score <= 89) {
            System.out.println("B");

        } else {
            System.out.println("A");

        }

        // 이지원님
        System.out.println("이지원님");
        if(score < 0 || score > 100)
        {
            System.out.println("올바르지 않은 점수입니다.");
        }
        else if(score >= 90)
        {
            System.out.println("A");
        }
        else if (score >= 80)
        {
            System.out.println("B");
        }
        else if (score >= 70)
        {
            System.out.println("C");
        }
        else if (score >= 60)
        {
            System.out.println("D");
        }
        else
        {
            System.out.println("F");
        }


        // 한나라님
        System.out.println("한나라님");
        Scanner sc = new Scanner(System.in);

        System.out.print("점수를 입력하세요: ");
        score = sc.nextInt();

        if (score >= 90 && score <= 100) {
            System.out.println("A");
        } else if (score >= 80 && score <= 89) {
            System.out.println("B");
        } else if (score >= 70 && score <= 79) {
            System.out.println("C");
        } else if (score >= 60 && score <= 69) {
            System.out.println("D");
        } else if (score >= 0 && score <= 59) {
            System.out.println("E");
        } else {
            System.out.println("그 외의 점수입니다 다시 시도해주세요");
        }

        sc.close();

        // 임민교님
        System.out.println("임민교님");
        if (score >= 90 && score <= 100) {
            grade2 = 'A';
        } else if (score >= 80 && score < 90) {
            grade2 = 'B';
        } else if (score >= 70 && score < 80) {
            grade2 = 'C';
        } else if (score >= 60 && score < 70) {
            grade2 = 'D';
        } else if (score >= 0 && score < 60) {
            grade2 = 'F';
        } else {
            System.out.println("올바르지 않은 점수입니다.");
        }
        System.out.println(grade2);

        // 김남규님
        System.out.println("김남규님");
        if (score >= 90 && score <= 100) {
            System.out.println("A");
        } else if (score >= 80 && score < 90) {
            System.out.println("B");
        } else if (score >= 70 && score < 80) {
            System.out.println("C");
        } else if (score >= 60 && score < 70) {
            System.out.println("D");
        } else if (score >= 0 && score < 60) {
            System.out.println("F");
        } else {
            System.out.println("invalid score!!!");
        }

        // 소지현님
        System.out.println("소지현님");
        if (score >= 90 && score <= 100) {
            System.out.println("A");
        }else if (score >= 80) {
            System.out.println("B");
        }else if (score >= 70) {
            System.out.println("C");
        }else if (score >= 60) {
            System.out.println("D");
        }else if (score >= 0) {
            System.out.println("F");
        }else if (score < 0 || score > 100) {
            System.out.println("올바르지 않은 점수입니다.");
        }

        // 이환범님
        System.out.println("이환범님");
        if (score >= 90 && score <= 100) {
            System.out.println("A");
        }else if (score >= 80) {
            System.out.println("B");
        }else if (score >= 70) {
            System.out.println("C");
        }else if (score >= 60) {
            System.out.println("D");
        }else if (score >= 0 && score <= 59) {
            System.out.println("F");
        }else {
            System.out.println("올바르지 않은 점수입니다.");
        }

        // 이재원님
        System.out.println("이재원님");
        if (score <= 100 && score >= 90) {
            System.out.println("학점: A");
        }
        else if (score < 90 && score >= 80) {
            System.out.println("학점: B");
        }
        else if (score < 80 && score >= 70) {
            System.out.println("학점 C");
        }
        else if (score < 70 && score >= 60) {
            System.out.println("학점 D");
        }
        else if (score < 60 && score >= 0){
            System.out.println("학점 F");
        }
        else {
            System.out.println("올바르지 않은 점수입니다.");
        }

        // 임문섭님
        System.out.println("임문섭님");
        System.out.println("현재 수치 : " + score);

        if (score <= 100 && score >= 90) {
            System.out.println("Status : Prime");
        }

        else if (score < 90 && score >= 80) {
            System.out.println("Status : Solid");
        }

        else if (score < 80 && score >= 70) {
            System.out.println("Status : Stable");
        }

        else if (score < 70 && score >= 60) {
            System.out.println("Status : Border");
        }

        else if (score < 60 && score >= 0) {
            System.out.println("Status : Low");
        }

        else {
            System.out.println("올바르지 않은 수치입니다.");
        }

        // 윤승영님
        System.out.println("윤승영님");
        if(score < 0 || score > 100) {
            System.out.println("올바르지 않은 점수입니다.");

        } else if(score >= 90) {
            System.out.println("A");
        } else if(score >= 80) {
            System.out.println("B");
        } else if(score >= 70) {
            System.out.println("C");
        } else if(score >= 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }

        // 김혜란님
        System.out.println("김혜란님");
        if (score >= 90 && score <= 100) {
            System.out.println("A");
        } else if (score >= 80) {
            System.out.println("B");
        } else if (score >= 70) {
            System.out.println("C");
        } else if (score >= 60) {
            System.out.println("D");
        } else if (score >= 0 && score <= 59) {     // && score <= 59 는 생략해도 된다.
            System.out.println("F");
        } else {
            System.out.println("올바르지 않은 점수입니다.");
        }
    }
}
