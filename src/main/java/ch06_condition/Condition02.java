package ch06_condition;
/*
    if - else문 : if 다음에 있는 조건식이 true 일 때는 if문 내의 {} 실행문이 실행됨
    / false 인 경우에는 else 에 딸리 {} 실행문이 실행됨

        형식 :
        if(조건식){
            실행문1
        } else {        // else 의 경우 if가 false 일 때만 실행되기 때문에
            실행문2      // if 에서처럼 조건식이 존재하지 않습니다.
        }
 */
public class Condition02 {
    public static void main(String[] args) {
        int num1 = 0;
        if(num1 > 0) System.out.println("num1은 양수입니다.");
        else System.out.println("num1은 0이거나 음수입니다.");
    }
}
