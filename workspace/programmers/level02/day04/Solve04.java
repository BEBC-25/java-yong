/* 배열의 평균값
 *
 * [문제 설명]
 * 정수 배열 numbers가 매개변수로 주어질 때, numbers의 원소들의 평균값을 return 하도록 solution 함수를 완성해주세요.
 *
 * [제한사항]
 * 0 <= numbers의 원소 <= 1000
 * 1 <= numbers의 길이 <= 100
 * 정답의 소수 부분이 .0 또는 .5인 경우만 입력으로 주어집니다.
 *
 * [입출력 예]
 * numbers | result
 * [1, 2, 3, 4, 5, 6, 7, 8, 9, 10] | 5.5
 * [89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99] | 94.0
 *
 * [입출력 예 설명]
 * 예제 1번: numbers의 원소들의 합은 55이고, numbers의 길이는 10입니다. 55 / 10 = 5.5를 return 합니다.
 * 예제 2번: numbers의 원소들의 합은 1034이고, numbers의 길이는 11입니다. 1034 / 11 = 94.0을 return 합니다.
 */

package level02.day04;

public class Solve04 {
    public double solution(int[] numbers) {
        double sum = 0;
        // 배열 내 모든 정수 원소들의 합을 구합니다.
        for (int number : numbers) {
            sum += number;
        }
        // 실수 타입인 sum을 배열 크기로 나누어 정확한 소수점 평균을 도출합니다.
        double answer = sum / numbers.length;
        return answer;
    }

    void main() {
        System.out.println(solution(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}));
        System.out.println(solution(new int[]{89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99}));
    }
}
