package ch09_classes;

public class Car {
    /*
        지시사항
        색상(빨강/노랑 etc), 속도(100, 200 etc) 필드를 정의
        drive() / brake() / displayCarInfo() 메서드 정의
        1. drive() 결과값
            : 빨강 자동차가 주행 중 입니다.
              최고 속도는 100 입니다.
        2. brake() 결과값
            : 빨강 자동차가 멈췄습니다.
        3. displayCarInfo() 결과값
            : 이 차의 색깔은 빨강색이고,
             최고 속도는 100km/h 입니다. 보통입니다. -> if문 사용

             이 차의 색깔은 노랑색이고,
             최고 속도는 100km/h 입니다. 빠릅니다. -> 100 이하면 보통 100 초과면 빠릅니다. 출력 될수 있도록 메서드 작성

         다 작성하시면 car1의 색깔 빨강 / 속도 100으로 생성
         car2의 색깔 노랑 / 속도 200으로 생성한 후
         각각 drive()/brake()/displayCarInfo() 를 실행, 콘솔창에 출력
     */
    String color;
    int speed;

    public void drive(){
        System.out.println(color + " 자동차가 주행 중 입니다.\n최고 속도는 "+speed+" 입니다.");
    }

    public String brake() {
        return color + " 자동차가 멈췄습니다.";
    }

    public void displayCarInfo() {
        String eval = (speed > 100 ? "빠릅니다.": "보통입니다.");
        System.out.println(color + " 자동차가 주행 중 입니다.\n최고 속도는 "+speed+" 입니다."+eval);
    }

    // Constructor
}
