package ch15_casting.control;

public class CentralControl {
    // 필드 선언
    private Power[] deviceArray;

    // 매개변수 생성자를 작성
    public CentralControl(Power[] deviceArray) {
        this.deviceArray = deviceArray;
    }

    // Main 에서 확인결과 곧장 element 가 있는 배열을 집어넣지 못했으니까
    // Power의 자식 클래스의 인스턴스들을 집어 넣는 메서드를 정의

    public void addDevice(Power device){
        // 왜 매개변수의 자료형이 Power 인지도 고민이 필요
        // Computer / LED / Mouse 에 해당하는 객체들을 신경쓰지 않고 넣기 위해 -> 어차피 암시적으로 업캐스팅 되니까!
        int emptyIndex = checkEmpty();

        if(emptyIndex == -1){               // checkEmpty() 메서드의 결과값이 -1 이라면 배열이 비어있지 않다는 의미
            System.out.println("더 이상 장치를 연결 할 수 없습니다.");
            return;
        }
        deviceArray[emptyIndex] = device;
        System.out.println(device.getClass().getSimpleName() + " 장치가 연결 되었습니다.");
    }

    // 비어있는 배열의 index number 를 반환하기 위한 method
    private int checkEmpty(){
        // 배열을 반복문을 돌려가지고 null 값 빠져나오는 애를 return
        // 가장 빨리 만나게 되는 null의 index number가 반환
        for(int i = 0; i < deviceArray.length; i++){
            if(deviceArray[i] == null){
                return i;
            }
        }
        // 근데 안 비어있는 경우도 있겠죠
        return -1;
    }

    public void powerOn(){
        for(Power device : deviceArray){
            if(device == null) {
                System.out.println("장치가 등록되지 않은 슬롯입니다.");
                continue;
            }
            device.on();
        }
    }

    public void powerOff(){
        for(int i = 0; i < deviceArray.length; i++){
            if(deviceArray[i] == null){
                System.out.println("장치가 등록되지 않은 "+ i +" 번째 슬롯입니다.");
                continue;
            }
            deviceArray[i].off();
        }
    }

    // 배열 내부를 돌면서 각 element의 고유 메서드를 호출할 수 있도록 메서드를 작성할 예정
    public void performSpecificMethod(){
        for(Power device : deviceArray){
            if(device instanceof Computer){             // 이 조건문이 true 라면 해당 element는 computer의 인스턴스
                Computer computer = (Computer) device;  // 명시적 다운캐스팅
                computer.compute();                     // 마찬가지로 computer로 다운 캐스팅이 이루어져서 고유 메서드 실행 가능
            }else if(device instanceof Mouse){
                Mouse mouse = (Mouse) device;
                mouse.leftClick();
            }else if(device instanceof LED){
                LED led = (LED) device;
                led.changeColor();
            }else if(device instanceof SmartPhone){
                SmartPhone smartPhone = (SmartPhone) device;
                smartPhone.touchScreen();
            }else if(device instanceof Speaker){
                Speaker speaker = (Speaker) device;
                speaker.changeEqual();
            }else if(device instanceof Tv){
                Tv tv = (Tv) device;
                tv.channelUp();
            }
        }
    }
}
