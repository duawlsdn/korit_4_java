package ch11_access_modifier;

public class BankMain {
    public static void main(String[] args) {
        Bank bank1 = new Bank();
        bank1.setAccountNum(123456);
        bank1.setAccountHolder("홍길동");

        System.out.println("---잘못된 초기 입금 금액---");
        bank1.setBalance(-100);
        System.out.println(bank1.getPinNumber());

        bank1.setBalance(100000);
        bank1.setPinNumber(1111);

        System.out.println("\n---입금 금액은 맞지만 비밀번호가 틀린 코드---");
        bank1.deposit(100,1112);

        System.out.println("\n---입금 금액은 맞지만 비밀번호가 틀린 코드---");
        bank1.withdraw(450,1112);

        System.out.println("\n---잔액보다 많이 출금한 사례---");
        bank1.withdraw(5100000,1111);

        System.out.println("\n---성공 사례---");
        bank1.withdraw(4000,1111);

        System.out.println("\n---최종 내역---");
        bank1.showAccountInfo();


//        Bank bank2 = new Bank();
//        bank2.setAccountNum(987654);
//        bank2.setAccountHolder("신사임당");
//        bank2.setBalance(500000);
//        bank2.setPinNumber(2222);
//        bank2.deposit(50000,2222);
//        bank2.withdraw(500000,2222);
//        bank2.showAccountInfo();
    }
}
