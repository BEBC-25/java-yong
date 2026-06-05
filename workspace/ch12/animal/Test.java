package ch12.animal;

public class Test {
    public static void main(String[] args){
        Dog haru = new Dog();
//        Animal haru = new Dog(); // 자식 인스턴스를 부모의 타입으로 선언 가능함
        haru.eat(); // 부모에게 물려 받은 메서드
        haru.bark(); // 추가한 메서드

        animalCare(haru);


        // is-a 관계가 성립되지 않는 잘못된 상속
//        Notebook book = new Notebook();
//        animalCare(book);

        Cat c = new Cat();
        animalCare(c);
    }

    // 강아지 관리 서비스
    static void animalCare(Dog a){
        a.eat();
        a.move();
        a.sleep();
        a.bark(); // Animal에는 정의되어 있지 않음
    }

    // 고양이 관리 서비스
    static void animalCare(Cat a){
        a.eat();
        a.move();
        a.liquefy(); // Animal에는 정의되어 있지 않음
        a.sleep();
    }
}
