/* 수열과 구간 쿼리 2
 *
 * [문제 설명]
 * 정수 배열 arr와 2차원 정수 배열 queries이 주어집니다. queries의 원소는 각각 하나의 query를 나타내며, [s, e, k] 꼴입니다.
 * 각 query마다 순서대로 s <= i <= e인 모든 i에 대해 k보다 크면서 가장 작은 arr[i]를 찾습니다.
 * 각 쿼리의 순서에 맞게 답을 저장한 배열을 반환하는 solution 함수를 완성해 주세요.
 * 단, 특정 쿼리의 답이 존재하지 않으면 -1을 저장합니다.
 *
 * [제한사항]
 * 1 <= arr의 길이 <= 1,000
 * 0 <= arr의 원소 <= 1,000,000
 * 1 <= queries의 길이 <= 1,000
 * 0 <= s <= e < arr의 길이
 * 0 <= k <= 1,000,000
 *
 * [입출력 예]
 * arr | queries | result
 * [0, 1, 2, 4, 3] | [[0, 4, 2],[0, 3, 2],[0, 2, 2]] | [3, 4, -1]
 *
 * [입출력 예 설명]
 * 입출력 예 #1
 * 첫 번째 쿼리의 범위에는 0, 1, 2, 4, 3이 있으며 이 중 2보다 크면서 가장 작은 값은 3입니다.
 * 두 번째 쿼리의 범위에는 0, 1, 2, 4가 있으며 이 중 2보다 크면서 가장 작은 값은 4입니다.
 * 세 번째 쿼리의 범위에는 0, 1, 2가 있으며 여기에는 2보다 큰 값이 없습니다.
 * 따라서 [3, 4, -1]을 return 합니다.
 */

package level01.day06;

import java.util.Arrays;

public class Solve05 {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];

        for (int q = 0; q < queries.length; q++) {
            int s = queries[q][0];
            int e = queries[q][1];
            int k = queries[q][2];

            int minVal = Integer.MAX_VALUE;

            // 각 쿼리에 대해 주어진 범위 내에서 k보다 크면서 가장 작은 값을 탐색
            for (int i = s; i <= e; i++) {
                if (arr[i] > k && arr[i] < minVal) {
                    minVal = arr[i];
                }
            }

            // 조건에 맞는 값이 존재하지 않으면 -1을 저장
            if (minVal == Integer.MAX_VALUE) {
                answer[q] = -1;
            } else {
                answer[q] = minVal;
            }
        }

        return answer;
    }

    void main() {
        System.out.println(Arrays.toString(solution(
            new int[]{0, 1, 2, 4, 3},
            new int[][]{{0, 4, 2}, {0, 3, 2}, {0, 2, 2}}
        )));
    }
}
