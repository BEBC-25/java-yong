/* 직각삼각형 출력하기
 *
 * [문제 설명]
 * "*"을 입력받은 높이와 너비가 n인 직각이등변삼각형을 출력하도록 코드를 작성해보세요.
 *
 * [제한사항]
 * 1 <= n <= 10
 *
 * [입출력 예]
 * 입력: 3
 * 출력:
 * *
 * **
 * ***
 */

package level02.day06;

import java.util.Scanner;

public class Solve02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // 1행부터 n행까지 순차적으로 행별로 별을 출력합니다.
        for (int i = 1; i <= n; i++) {
            // 현재 행 번호(i)만큼 별을 연달아 출력합니다.
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            // 한 행을 다 출력한 뒤 줄을 바꿉니다.
            System.out.println();
        }
    }
}
