/* 문자열 뒤집기
 *
 * [문제 설명]
 * 문자열 my_string이 매개변수로 주어질 때, my_string을 거꾸로 뒤집은 문자열을 return 하도록 solution 함수를 완성해주세요.
 *
 * [제한사항]
 * 1 <= my_string의 길이 <= 1,000
 *
 * [입출력 예]
 * my_string | result
 * "jaron" | "noraj"
 * "bread" | "daerb"
 *
 * [입출력 예 설명]
 * 예제 1번: my_string이 "jaron"이므로 거꾸로 뒤집은 "noraj"를 return 합니다.
 * 예제 2번: my_string이 "bread"이므로 거꾸로 뒤집은 "daerb"를 return 합니다.
 */

package level02.day06;

public class Solve01 {
    public String solution(String my_string) {
        // StringBuilder의 내장 메서드인 reverse()를 이용해 문자열을 뒤집습니다.
        return new StringBuilder(my_string).reverse().toString();
    }

    void main() {
        System.out.println(solution("jaron"));
        System.out.println(solution("bread"));
    }
}
