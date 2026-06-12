package ch11.capsule.ex03;

// 잔고를 직접 수정할 수 있어서 입출금 메서드의 체크 로직이 무력화 됨
public class AccountBad {
    // 잔고
    public int balance;

    // 입금(amount 만큼 balance를 증가)
    public void deposit(int amount){
        if(amount > 0){
            this.balance += amount;
            System.out.println(amount + "원이 입금 되었습니다. 잔고는 " + balance + "원 입니다.");
        }else{
            System.out.println("입금액이 잘못 되었습니다.");
        }
    }

    // 출금(amount 만큼 balance를 감소, 잔고가 부족한지 체크 필요)
    public void withdraw(int amount){
        if(balance >= amount) {
            this.balance -= amount;
            System.out.println(amount + "원이 출금 되었습니다. 잔고는 " + balance + "원 입니다.");
        }else{
            System.out.println("잔고가 부족합니다. 잔고는 " + balance + "원 입니다.");
        }
    }
}
