/* 대소문자 변환해서 출력하기
 *
 * [문제 설명]
 * 영어 알파벳으로 이루어진 문자열 str이 주어집니다.
 * 각 알파벳을 대문자는 소문자로 소문자는 대문자로 변환해서 출력하는 코드를 작성해 보세요.
 *
 * [제한사항]
 * 1 <= str의 길이 <= 20
 * str은 알파벳으로 이루어진 문자열입니다.
 *
 * [입출력 예]
 * 입력 #1: aBcDeFg
 * 출력 #1: AbCdEfG
 */

package level01.day01;

import java.util.Scanner;

public class Solve04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();

        StringBuilder sb = new StringBuilder();
        // 각 문자를 순회하며 대소문자를 반대로 변환합니다.
        for (int i = 0; i < a.length(); i++) {
            char c = a.charAt(i);
            // https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/Character.html#isUpperCase(char)
            if (Character.isUpperCase(c)) {
                // https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/Character.html#toLowerCase(char)
                sb.append(Character.toLowerCase(c));
            } else {
                // https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/Character.html#toUpperCase(char)
                sb.append(Character.toUpperCase(c));
            }
        }
        System.out.println(sb.toString());
    }
}