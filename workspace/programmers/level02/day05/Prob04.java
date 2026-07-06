/* 배열 뒤집기
 *
 * [문제 설명]
 * 정수 배열 num_list가 매개변수로 주어질 때, 
 * num_list의 원소 순서를 거꾸로 뒤집은 배열을 return 하도록 solution 함수를 완성해주세요.
 *
 * [제한사항]
 * 1 <= num_list의 길이 <= 1,000
 * 0 <= num_list의 원소 <= 1,000
 *
 * [입출력 예]
 * num_list | result
 * [1, 2, 3, 4, 5] | [5, 4, 3, 2, 1]
 * [1, 1, 1, 1, 1, 2] | [2, 1, 1, 1, 1, 1]
 * [1, 2, 10, 1, 9] | [9, 1, 10, 2, 1]
 *
 * [입출력 예 설명]
 * 예제 1번: num_list가 [1, 2, 3, 4, 5]이므로 순서를 뒤집은 [5, 4, 3, 2, 1]을 return 합니다.
 * 예제 2번: num_list가 [1, 1, 1, 1, 1, 2]이므로 순서를 뒤집은 [2, 1, 1, 1, 1, 1]을 return 합니다.
 * 예제 3번: num_list가 [1, 2, 10, 1, 9]이므로 순서를 뒤집은 [9, 1, 10, 2, 1]을 return 합니다.
 */

package level02.day05;

import java.util.Arrays;

public class Prob04 {
    public int[] solution(int[] num_list) {
        int[] answer = {};
        return answer;
    }

    void main() {
        System.out.println(Arrays.toString(solution(new int[]{1, 2, 3, 4, 5})));
        System.out.println(Arrays.toString(solution(new int[]{1, 1, 1, 1, 1, 2})));
        System.out.println(Arrays.toString(solution(new int[]{1, 2, 10, 1, 9})));
    }
}
