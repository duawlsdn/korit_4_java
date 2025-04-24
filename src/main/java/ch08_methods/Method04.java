package ch08_methods;

import java.util.Scanner;

/*
    bmi 계산기 method 를 정의하고 실행
    메서드명 : calculateBmi()
    return type : void
    매개변수 유무 : 없음
    BMI :
 */
public class Method04 {
    // 여기에 정의
    public static void calculateBmi(){
        Scanner scanner = new Scanner(System.in);
        String cat = "";

        System.out.print("키(cm)를 입력하세요 >>> ");
        double cm = scanner.nextDouble()/100;
        System.out.print("몸무게(kg)를 입력하세요 >>> ");
        double kg = scanner.nextDouble();
        double BMI = kg / (cm*cm);

        if(BMI > 34){
            cat = "3단계 비만";
        }else if(BMI > 29.99){
            cat = "2단계 비만";
        }else if(BMI > 24.99) {
            cat = "1단계 비만";
        }else if(BMI > 22.99){
            cat = "비만전단계";
        }else if(BMI > 18.49){
            cat = "정상";
        }else {
            cat = "저체중";
        }
        System.out.println("당신의 BMI 지수는 " + BMI + "이고, " + cat + "입니다.");
    }

    public static void main(String[] args) {
        calculateBmi();
        /*
            실행 예
            키(cm)를 입력하세요 >>> 173
            몸무게(kg)를 입력하세요 >>> 74
            당신의 BMI 지수는 ??.?? 이고, 과체중입니다.
         */
    }
}
