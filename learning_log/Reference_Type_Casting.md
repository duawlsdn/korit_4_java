# 참조 자료형 캐스팅(Reference Type Casting)
## 정의
- Java 에서  자료형은 크게 두가지로 구분
    - 기본 자료형(Primitive Type) - int, double, char ...etc
    - 참조 자료형(Reference Type) - 객체를 참조하는 변수로 클래스나 인터페이스로 생성된 객체

그렇다면 참조자료형 캐스팅이란? -> 객체의 자료형을 변환하는 작업
여태까지의 객체 생성 방식
```java
A a = new A();
```
참조 자료형 캐스팅의 의미를 고려했을 때의 객체 생성 방식
```java
A a = new B();
```

## 캐스팅 종류
1. 업 캐스팅 - 하위 클래스 타입의 객체를 상위 클래스 타입으로 변환
2. 다운 캐스팅 - 상위 클래스 타입의 객체를 하위 클래스 타입으로 변환

### 추가적으로 기억해야할 사항 : 연산자(Operator) instanceof
- ex - 1 + 1 == 2에서 +가 연산자에 해당하는 개념인데
- ex - 객체명 instanceof 클래스명 -> return true / false
#### 💻instanceof 사용 사례
- 아래 코드를 예시
```java
boolean result1 = animal1 instanceof Animal;
System.out.println(result1);                // true
boolean result2 = animal2 instanceof Dog;
System.out.println(result2);                // true

// instanceof 의 결과값이 true : 확인하고자 하는 object 가 해당 클래스의 인스턴스이거나 '하위 클래스'의 인스턴스 일 때

boolean result3 = dog1 instanceof Dog;
System.out.println(result3);                // true
boolean result4 = dog1 instanceof Animal;
System.out.println(result4);                // true

Animal animal3 = new Animal();
boolean result5 = animal3 instanceof Animal;
System.out.println(result5);                // true
boolean result6 = animal3 instanceof Dog;
System.out.println(result6);                // false
```

### 업 캐스팅
- 암시적(Implicit)으로 이루어짐 -> 자동 변환. 근데 언제 알아서 바뀌었는지 개발자가 알아야 함
#### 💻업 캐스팅 사용 사례
```java
import ch15_casting.animals.Animal;

// Animal의 고유 메서드가 존재 -> 
// makeSound(){sout("동물이 소리를 냅니다.")}
public class Dog extends Animal {
    // Animal method
    @Override
    public void makeSound() {
        super.makeSound();
        System.out.println("강아지가 짖습니다.");
    }

    // Dog 클래스의 고유 메서드
    public void fetch() {
        System.out.println("강아지가 공을 물어옵니다.");
    }
}

public static void main(String[] args) {
    // 객체 생성
    Dog dog1 = new Dog();
    dog1.makeSound();                   // -> 강아지가 짖습니다.

    // 일반 객체 생성
    Animal animal1 = new Animal();
    animal1.makeSound();                // -> 동물이 소리를 냅니다.

    // 업캐스팅 방법 # 1 A a = new B();
    Animal animal2 = new Dog();
    animal2.makeSound();                // -> 강아지가 짖습니다.

    // 업캐스팅 방법 # 2 
    Animal animal3 = dog1;
    animal3.makeSound();                // -> 강아지가 짖습니다.
}
```

### 다운 캐스팅
- 명시적(Explicit)으로 이루어짐 -> 반드시 개발자가 적절한 장소와 시간대에 사용해야 함
- 다운 캐스팅의 전제 조건은 `A a = new B();` 에서 출발
#### 💻다운 캐스팅 사용 사례
```java
Dog dog2 = (Dog) animal2;
dog2.makeSound();
dog2.fetch();

animal2.makeSound();
((Dog) animal2).fetch();
```
### 업 캐스팅과 다운 캐스팅의 활용
- 캐스팅은 주로 다형성(Polymorphism)을 구현할 때 사용. 상위 클래스 타입으로 객체를 처리하면서도 동시에 하위 클래스의 고유 기능을 사용 가능

#### 캐스팅의 장단점
- 장점
    - 코드 유연성 - 업캐스팅을 통해 '다양한 객체를 하나의 상위 클래스 타입을 관리' 가능
    - 다형성 구현 - 메서드 오버라이딩과 함께 사용하면 코드의 재사용성↑
- 단점
    - 다운 캐스팅의 위험성 - 잘못 다운캐스팅을 하게 될 위험성이 있음
        - 예를 들어 상위 클래스 A와 하위 클래스 B,C가 있다고 가정했을 때, B의 객체인 b를 A로 업캐스팅을 해서 공통 메서드를 실행시킨 후에,
          C 자료형으로 다운캐스팅을 하게 되면 오류 발생

    - 복잡성 증가 - 코드 가독성이 떨어질 수 있음. A로 바꿨다가 B로 내렸다가 또 A로 올렸다가 C로 잘못 다운캐스팅하면 안되니까 보험용 코드
      작성했다가 난리를 치게 되면 복잡성이 증가. 특히 업캐스팅의 경우 암시적으로 일어나니까 지혼자서 상위클래스로 바뀌었는데 언제 바뀌었는지
      모르는 상태로 다운 캐스팅 진행하려고 하면 그 와중에 오류 발생하고 어디부터 고쳐야하는지 모르는 경우가 많이 생김

    - 이상의 문제를 해결하기 위한 연산자 - instanceof
```java
public static void main(String[] args) {
  System.out.println(objectA instanceof ClassA);    // 결과값 : true / false
}
```
- return 값이 true / false 이므로 if 조건문과 함께 사용되는 일이 많습니다.

### 💻다중 상속 및 캐스팅 관련 사용 사례
```java
import ch15_casting.control.CentralControl;
import ch15_casting.control.Computer;
import ch15_casting.control.LED;
import ch15_casting.control.Mouse;

public interface Power {
    void on();

    void off();
}

// Computer / LED / Mouse 는 각각 Power를 implements 및 메서드 재정의
public static void main(String[] args) {
    // 각각의 개체 생성
    Computer computer1 = new Computer();
    LED led = new LED();
    Mouse mouse = new Mouse();
    // 객체의 배열을 선언
    CentralControl control1 = new CentralControl(new Power[5]);
}

public class CentralControl{
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
        /*
            객체명.getClass() -> 패키지명을 포함한 클래스명이 출력(@주소지 생략)
            객체명.getClass().getSimpleName() -> 패키지명도 생략하고 클래스명만 반환
            특히 30번 라인의 경우 메서드 체이닝이라는 표현으로 자주 쓰입니다.
         */
    }

    private int checkEmpty(){    // 비어있는 배열의 index number 를 반환하기 위한 method
        // 배열을 반복문을 돌려가지고 null 값 빠져나오는 애를 return
        // 가장 빨리 만나게 되는 null의 index number가 반환
        for(int i = 0; i < deviceArray.length; i++){
            if(deviceArray[i] == null){
                return i;
            }
        }
        // 근데 안 비어있는 경우도 있겠죠
        return -1;
        /*
            Java 에서 index 넘버에는 음수값이 없기 때문에 (근데 python 에는 마이너스 인덱스가 있음)
            실패을 나타낼 때 -1을 쓰는 경우가 많습니다.
            근데 0과 너무 가까운 수다보니까 -100 을 먹인다든지 혹은 return 값으로 나올 수 없을만한 음수를 지정하는 경우도 있는데
            나중에 addDevice() 메서드에 if(checkEmpty() == -123153)로 쓰고 싶지 않다면 -1 을 쓰는게 정신건강에 좋음
         */
    }

    public void powerOn(){
        // deviceArray 배열 내에 있는 각 element 들은 Power 서브 클래스의 인스턴스에 해당
        // 그러면 .on() / .off() 를 전부 다 가지고 있을 거고, instanceof 를 쓸 필요 X
        for(Power device : deviceArray){
            if(device == null) {
                System.out.println("장치가 등록되지 않은 슬롯입니다.");
                continue;   // 메서드를 종료하는게 아니라 다음 반복으로 넘어가는 키워드
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
}
```