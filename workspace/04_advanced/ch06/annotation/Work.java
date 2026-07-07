package ch06.annotation;

public class Work {
    @MeasureTime
    public void task1(){
        System.out.println("task1 실행");
    }

    public void task2(){
        System.out.println("task2 실행");
    }
}
