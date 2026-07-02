/* 짝수는 싫어요
 *
 * [문제 설명]
 * 정수 n이 매개변수로 주어질 때, n 이하의 홀수가 오름차순으로 담긴 배열을 return 하도록 solution 함수를 완성해주세요.
 *
 * [제한사항]
 * 1 <= n <= 100
 *
 * [입출력 예]
 * n | result
 * 10 | [1, 3, 5, 7, 9]
 * 15 | [1, 3, 5, 7, 9, 11, 13, 15]
 *
 * [입출력 예 설명]
 * 예제 1번: 10 이하의 홀수는 1, 3, 5, 7, 9 이므로 [1, 3, 5, 7, 9]를 return 합니다.
 * 예제 2번: 15 이하의 홀수는 1, 3, 5, 7, 9, 11, 13, 15 이므로 [1, 3, 5, 7, 9, 11, 13, 15]를 return 합니다.
 */

package level02.day03;

import java.util.Arrays;

public class Prob04 {
    public int[] solution(int n) {
        int[] answer = {};
        return answer;
    }

    void main() {
        System.out.println(Arrays.toString(solution(10)));
        System.out.println(Arrays.toString(solution(15)));
    }
}
