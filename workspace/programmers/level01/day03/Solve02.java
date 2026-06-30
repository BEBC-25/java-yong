/* 문자리스트를 문자열로 변환하기
 *
 * [문제 설명]
 * 문자들이 담겨있는 배열 arr가 주어집니다.
 * arr의 원소들을 순서대로 이어 붙인 문자열을 return 하는 solution함수를 작성해 주세요.
 *
 * [제한사항]
 * 1 <= arr의 길이 <= 200
 * arr의 원소는 전부 알파벳 소문자로 이루어진 길이가 1인 문자열입니다.
 *
 * [입출력 예]
 * arr | result
 * ["a","b","c"] | "abc"
 */

package level01.day03;

public class Solve02 {
    public String solution(String[] arr) {
        String answer = "";
        for(String str : arr){
          answer += str;
        }
        return answer;

        // 또는 String.join 메서드를 활용하여 문자열 배열의 요소들을 공백 없이 이어 붙입니다.
        // https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/String.html#join(java.lang.CharSequence,java.lang.CharSequence...)
        // String answer = String.join("", arr);
        // return answer;
    }

    void main() {
        System.out.println(solution(new String[]{"a", "b", "c"}));
    }
}
