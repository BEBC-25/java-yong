/* 문자 반복 출력하기
 *
 * [문제 설명]
 * 문자열 my_string과 정수 n이 매개변수로 주어질 때, 
 * my_string에 들어있는 각 문자를 n번 반복한 문자열을 return 하도록 solution 함수를 완성해보세요.
 *
 * [제한사항]
 * 2 <= my_string의 길이 <= 5
 * 2 <= n <= 10
 * my_string은 영어 대소문자로만 이루어져 있습니다.
 *
 * [입출력 예]
 * my_string | n | result
 * "hello" | 3 | "hhheeellllllooo"
 *
 * [입출력 예 설명]
 * 예제 1번: "hello"의 각 문자를 3번씩 반복한 "hhheeellllllooo"를 return 합니다.
 */

package level02.day06;

public class Solve04 {
    public String solution(String my_string, int n) {
        StringBuilder sb = new StringBuilder();
        // 문자열의 각 문자(char)를 n번 반복(repeat)하여 조립합니다.
        for (char c : my_string.toCharArray()) {
            sb.append(String.valueOf(c).repeat(n));
        }
        return sb.toString();
    }

    void main() {
        System.out.println(solution("hello", 3));
    }
}
