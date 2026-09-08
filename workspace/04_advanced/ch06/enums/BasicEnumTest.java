package ch06.enums;

public class BasicEnumTest {

    // 월을 Eunm 타입으로 정의
    enum Month {
        JAN, FEB, MAR, SUN
    }

    // 요일을 Enum 타입으로 정의
    enum Day {
        SUN, MON, TUE
    }

    // 월을 입력받아 한국어 명칭으로 반환하는 메서드
    public String getMonth(Month month){
        return switch(month){
            case JAN -> "1월";
            case FEB -> "2월";
            case MAR -> "3월";
            default -> "알 수 없는 월";
        };
    }
    
    // 요일을 입력받아 한국어 명칭으로 반환하는 메서드
    public String getDay(Day day){
        return switch(day){
            case SUN -> "일요일";
            case MON -> "월요일";
            case TUE -> "화요일";
            default -> "알 수 없는 요일";
        };
    }

    void main(){
        System.out.println("정상 호출: " + getMonth(Month.MAR)); // 3월
        System.out.println("정상 호출: " + getDay(Day.MON)); // 월요일

//        System.out.println("비정상 호출(월 메서드에 요일을 잘못 전달): " + getMonth(Day.SUN)); // 1월
//        System.out.println("비정상 호출(유효하지 않은 값을 전달): " + getMonth(13)); // 1월
    }
}
