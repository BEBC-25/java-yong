/* 옷가게 할인 받기
 *
 * [문제 설명]
 * 머쓱이네 옷가게는 10만 원 이상 사면 5%, 30만 원 이상 사면 10%, 50만 원 이상 사면 20%를 할인해줍니다. 
 * 구매한 옷의 가격 price가 매개변수로 주어질 때, 지불해야 할 금액을 return 하도록 solution 함수를 완성해보세요.
 *
 * [제한사항]
 * 10 <= price <= 1,000,000
 * price는 10원 단위로 주어집니다.
 * 소수점 이하를 버린 정수를 return합니다.
 *
 * [입출력 예]
 * price | result
 * 150000 | 142500
 * 580000 | 464000
 *
 * [입출력 예 설명]
 * 예제 1번: 150,000원은 10만 원 이상이므로 5%를 할인한 142,500원을 return 합니다.
 * 예제 2번: 580,000원은 50만 원 이상이므로 20%를 할인한 464,000원을 return 합니다.
 */

package level02.day05;

public class Prob01 {
    public int solution(int price) {
        int answer = 0;
        return answer;
    }

    void main() {
        System.out.println(solution(150000));
        System.out.println(solution(580000));
    }
}
