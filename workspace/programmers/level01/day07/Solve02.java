/* 배열 만들기 2
 *
 * [문제 설명]
 * 정수 l과 r이 주어졌을 때, l 이상 r이하의 정수 중에서 숫자 "0"과 "5"로만 이루어진 모든 정수를 오름차순으로 저장한 배열을 return 하는 solution 함수를 완성해 주세요.
 * 만약 그러한 정수가 없다면, -1이 담긴 배열을 return 합니다.
 *
 * [제한사항]
 * 1 <= l <= r <= 1,000,000
 *
 * [입출력 예]
 * l | r | result
 * 5 | 555 | [5, 50, 55, 500, 505, 550, 555]
 * 10 | 20 | [-1]
 *
 * [입출력 예 설명]
 * 입출력 예 #1
 * 5 이상 555 이하의 0과 5로만 이루어진 정수는 작은 수부터 5, 50, 55, 500, 505, 550, 555가 있습니다. 따라서 [5, 50, 55, 500, 505, 550, 555]를 return 합니다.
 *
 * 입출력 예 #2
 * 10 이상 20 이하이면서 0과 5로만 이루어진 정수는 없습니다. 따라서 [-1]을 return 합니다.
 */

package level01.day07;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solve02 {
    public int[] solution(int l, int r) {
        List<Integer> list = new ArrayList<>();

        for (int i = 1; ; i++) {
            // 이진수 형태의 문자열을 생성하고 1을 5로 변환하여 0과 5로만 이루어진 숫자를 생성
            String binary = Integer.toBinaryString(i);
            int num = Integer.parseInt(binary) * 5;

            // r 범위를 초과할 경우 탐색을 종료
            if (num > r) {
                break;
            }

            // 생성된 숫자가 범위 내에 존재할 경우 결과 목록에 추가
            if (num >= l) {
                list.add(num);
            }
        }

        // 결과 목록이 비어있으면 -1을 반환
        if (list.isEmpty()) {
            return new int[]{-1};
        }

        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }

    void main() {
        System.out.println(Arrays.toString(solution(5, 555)));
        System.out.println(Arrays.toString(solution(10, 20)));
    }
}
