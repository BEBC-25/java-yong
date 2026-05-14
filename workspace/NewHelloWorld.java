// java 21부터 Implicitly Declared Classes and Instance Main Methods 문법으로 인해 간략화 가능
// Implicitly Declared(Unnamed) Classes, 암묵적으로 선언된 클래스: 컴파일러가 파일명을 클래스명으로 사용. 외부에서 import 불가하므로 단독 실행 클래스에서 사용
//  - 완전한 자바 클래스로 인정하지 않아서 IntelliJ의 Project 탐색기에서 .java 확장자가 보임
// Instance Main Methods: JVM이 인스턴스 생성 후 호출함. 이제 자신의 메서드 호출시 인스턴스 생성하지 않아도 됨
void main(){
    System.out.println("New Hello World");
}


