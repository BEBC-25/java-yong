package ch06.enums;

public class ConstantProblemTest {

    // 월 상수 정의
    public static final int MON_JAN = 0;
    public static final int MON_FEB = 1;
    public static final int MON_MAR = 2;

    // 요일 상수 정의
    public static final int DAY_SUN = 0;
    public static final int DAY_MON = 1;
    public static final int DAY_TUE = 2;

    // 월을 입력받아 한국어 명칭으로 반환하는 메서드
    public String getMonth(int month){
        return switch(month){
            case MON_JAN -> "1월";
            case MON_FEB -> "2월";
            case MON_MAR -> "3월";
            default -> "알 수 없는 월";
        };
    }
    
    // 요일을 입력받아 한국어 명칭으로 반환하는 메서드
    public String getDay(int day){
        return switch(day){
            case DAY_SUN -> "일요일";
            case DAY_MON -> "월요일";
            case DAY_TUE -> "화요일";
            default -> "알 수 없는 요일";
        };
    }

    void main(){
        System.out.println("정상 호출: " + getMonth(MON_MAR)); // 3월
        System.out.println("정상 호출: " + getDay(DAY_MON)); // 월요일

        System.out.println("비정상 호출(월 메서드에 요일을 잘못 전달): " + getMonth(DAY_SUN)); // 1월
        System.out.println("비정상 호출(유효하지 않은 값을 전달): " + getMonth(13)); // 1월
    }
}
