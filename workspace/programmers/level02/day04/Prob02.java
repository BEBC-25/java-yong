/* 피자 나눠 먹기 (2)
 *
 * [문제 설명]
 * 머쓱이네 피자가게는 피자를 여섯 조각으로 잘라 줍니다. 
 * 피자를 나눠먹을 사람의 수 n이 주어질 때, n명이 주문한 피자를 남김없이 모두 같은 수의 피자 조각을 먹어야 한다고 합니다. 
 * 즉, n명이 같은 수의 피자 조각을 먹으면서 남는 피자 조각이 없어야 합니다. 
 * 이때 필요한 피자의 최소 판 수를 return 하는 solution 함수를 완성해보세요.
 *
 * [제한사항]
 * 1 <= n <= 100
 *
 * [입출력 예]
 * n | result
 * 6 | 1
 * 10 | 5
 * 4 | 2
 *
 * [입출력 예 설명]
 * 예제 1번: 6명이 피자 1판(6조각)을 주문하면 한 사람당 한 조각씩 남김없이 먹을 수 있습니다.
 * 예제 2번: 10명이 피자 5판(30조각)을 주문하면 한 사람당 세 조각씩 남김없이 먹을 수 있습니다.
 * 예제 3번: 4명이 피자 2판(12조각)을 주문하면 한 사람당 세 조각씩 남김없이 먹을 수 있습니다.
 */

package level02.day04;

public class Prob02 {
    public int solution(int n) {
        int answer = 0;
        return answer;
    }

    void main() {
        System.out.println(solution(6));
        System.out.println(solution(10));
        System.out.println(solution(4));
    }
}
