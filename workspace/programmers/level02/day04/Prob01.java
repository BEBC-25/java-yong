/* 피자 나눠 먹기 (1)
 *
 * [문제 설명]
 * 머쓱이네 피자가게는 피자를 일곱 조각으로 잘라 줍니다. 
 * 피자를 나눠먹을 사람의 수 n이 주어질 때, 모든 사람이 피자를 한 조각 이상 먹기 위해 필요한 피자의 수를 return 하는 solution 함수를 완성해보세요.
 *
 * [제한사항]
 * 1 <= n <= 100
 *
 * [입출력 예]
 * n | result
 * 7 | 1
 * 1 | 1
 * 15 | 3
 *
 * [입출력 예 설명]
 * 예제 1번: 7명이 최소 한 조각씩 먹기 위해서 피자 1판이 필요합니다.
 * 예제 2번: 1명이 최소 한 조각 먹기 위해서 피자 1판이 필요합니다.
 * 예제 3번: 15명이 최소 한 조각씩 먹기 위해서 피자 3판이 필요합니다.
 */

package level02.day04;

public class Prob01 {
    public int solution(int n) {
        int answer = 0;
        return answer;
    }

    void main() {
        System.out.println(solution(7));
        System.out.println(solution(1));
        System.out.println(solution(15));
    }
}
