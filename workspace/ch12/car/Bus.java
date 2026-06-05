package ch12.car;

public class Bus extends Car{
    private int passengerCount; // 승객 수
    private String no; // 버스 번호
    private String type; // 광역버스, 마을버스 ...

    // 컴파일러에 의해서 자동으로 생성되는 기본 생성자 모습
//    Bus(){ super(); }

    Bus(String model){
        super(model);
    }

    // 승차합니다.
    void ride(){
        passengerCount++;
    }

    // 하차합니다.
    void leave(){
        passengerCount--;
    }

    // 버스의 현재 상태를 출력합니다.
    void printBusInfo(){

    }

}
