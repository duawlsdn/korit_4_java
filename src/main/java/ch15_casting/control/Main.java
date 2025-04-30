package ch15_casting.control;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // 객체들 생성
        Computer computer1 = new Computer();
        LED led1 = new LED();
        Mouse mouse1 = new Mouse();
        CentralControl control1 = new CentralControl(new Power[5]);

        // 배열 생성 방법 - argument로 넣으세요.
//        Power[] powers = {computer1, led1, mouse1};
//        CentralControl control2 = new CentralControl(powers);

        control1.addDevice(computer1);                  // 여기서 0번지 인덱스를 차지했기 때문에
        control1.addDevice(led1);
        control1.addDevice(mouse1);

        // System.out.println(control1.checkEmpty());   // 결과값 : 1 -> 확인하고 checkEmpty()를 private 처리

        // SmartPhone / Speaker / Tv 객체를 각각 만들어서 순서대로 control1 객체의 필드인 deviceArray에 집어넣으시오
        SmartPhone smartPhone1 = new SmartPhone();
        Speaker speaker1 = new Speaker();
        Tv tv1 = new Tv();
        control1.addDevice(smartPhone1);
        control1.addDevice(speaker1);
        control1.addDevice(tv1);
        // deviceArray에 연결된 제품들의 전원을 켜도록 코드를 작성
        // tv1의 전원을 켜도록 코드를 작성
        System.out.println();
        control1.powerOn();
        tv1.on();

        // deviceArray에 연결된 제품들의 전원을 끄도록 코드를 작성
        // tv1의 전원을 끄도록 코드를 작성
        System.out.println();
        control1.powerOff();
        tv1.off();

        System.out.println();
        control1.performSpecificMethod();
        tv1.channelUp();
    }
}
