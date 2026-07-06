/* 짝수 홀수 개수
 *
 * [문제 설명]
 * 정수가 담긴 리스트 num_list가 매개변수로 주어질 때, 
 * num_list의 원소 중 짝수와 홀수의 개수를 담은 배열을 return 하도록 solution 함수를 완성해보세요.
 *
 * [제한사항]
 * 1 <= num_list의 길이 <= 100
 * 0 <= num_list의 원소 <= 1,000
 *
 * [입출력 예]
 * num_list | result
 * [1, 2, 3, 4, 5] | [2, 3]
 * [1, 3, 5, 7] | [0, 4]
 *
 * [입출력 예 설명]
 * 예제 1번: [1, 2, 3, 4, 5]에는 짝수가 2, 4로 2개, 홀수가 1, 3, 5로 3개 있으므로 [2, 3]을 return 합니다.
 * 예제 2번: [1, 3, 5, 7]에는 짝수가 없고 홀수가 4개 있으므로 [0, 4]를 return 합니다.
 */

package level02.day06;

import java.util.Arrays;

public class Prob03 {
    public int[] solution(int[] num_list) {
        int[] answer = {};
        return answer;
    }

    void main() {
        System.out.println(Arrays.toString(solution(new int[]{1, 2, 3, 4, 5})));
        System.out.println(Arrays.toString(solution(new int[]{1, 3, 5, 7})));
    }
}
