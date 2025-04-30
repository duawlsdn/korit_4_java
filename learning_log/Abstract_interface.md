# 추상 클래스(Abstract Class)
- abstract - 추상적인

## 추상클래스
1. 추상 메서드가 하나라도 포함되면 해당 클래스는 추상클래스로 정의돼야 함
2. 추상 클래스는 객체를 생성할 수 없음 -> 일반 클래스와의 차이
3. 그 외의 다른 특징은 일반 클래스와 동일함
4. 상속을 전제로 하는 클래스

- 추상 메서드(abstract method) : 선언만 있고 *구현*은 없는 메서드
- 추상 클래스(abstract class) : 추상 메서드가 하나 이상을 가지고 있는 클래스

```java
// 일반 메서드
public void showInfo(){
    System.out.println("안녕하세요. 제 이름은 " + name + "입니다.");
}

// 추상 메서드
public abstract void showInfo();    // 구현부{}는 자식 클래스에서 적용
```

## 추상 클래스의 장점
- 코드의 재사용성을 높이고 설계를 보다 명확하게 할 수 있도록 도와준다
- 위계관계를 파악하기 쉽다.

## 추상 클래스의 목적
1. 공통된 기능 제공 - 여러 클래스에서 공통적으로 사용하는 기능을 추상 클래스에서 정의 가능
2. 구체적인 구현 강제 - 추상 메서드를 통해 자식 클래스가 반드시 특정 메서드를 구현하도록 강제 가능
3. 코드의 재사용성 - 중복되는 코드를 줄이고 유지 보수성 ↑

## 주의 사항
객체 생성을 못합니다.

## super 키워드 - 부모 클래스의 field 및 메서드에 접근하기 위해서 사용(두 가지 있음)
1. super(매개변수) -> 자식 클래스에서 부모클래스로 생성자를 호출할 때 사용
2. super.메서드명(매개변수) -> 자식 클래스에서 부모클래스로 메서드를 호출할때 사용

- 특히 super 키워드의 경우 정처기 등 시험에서 자주 나오는 편, 그 경우 여러 개의 클래스가 나오기 때문에 난이도를 올리는 주범

### 추상 클래스 사용 예시
#### 💻사용 예시
```java
public abstract class Factory {
    private String name;
    public abstract void produce(String model);
    public abstract void manage();
    
    // setter / getter 생략
  
    // 추상 클래스 내 일반 메서드 가능
    public void displayInfo(){
      System.out.println("공장 정보를 출력합니다.\n공장 이름 : " + name);
    }
}

// 상속 받는 파트
public class PhoneFactory extends Factory{
  @Override
  public void produce(String model) {}

  @Override
  public void manage() {}
}

// Main 단계
public static void main(String[] args) {
    // PhoneFactory 객체 생성
    PhoneFactory phoneFactory1 = new PhoneFactory();
    phoneFactory1.setName("애플 스마트폰 공장");    // 부모 메서드 사용
    phoneFactory1.produce("아이폰 17");           // 재정의된 메서드 # 1 - 추상 메서드
    phoneFactory1.manage();                      // 재정의된 메서드 # 2 - 추상 메서드
    phoneFactory1.displayInfo();                 // 부모 메서드 사용
}
```
- `abstract`가 `메서드의 접근 지정자`와 `리턴 타입` `사이에 명시`되면, `클래스도 동일`하게 `abstract`가 있어야만 합니다.

#### 익명 클래스
- 재사용하지 않는다면 사용하기에 용이(단, Main 단계에서만 사용)
```java
// 추상클래스를 Main 단계에서 구현, 객체 생성
// 일반 클래스를 기준으로 봤을 때 메서드를 정의한 부분까지 작성
public static void main(String[] args) {
    Factory factory1 = new Factory() {
        @Override
        public void produce(String model) {
            System.out.println(this.getName() + "에서 [ " +model+" ] 을 생산합니다.");
        }
        @Override
        public void manage() {
            System.out.println("가전 제품 공장을 관리합니다.");
        }
    };
    factory1.setName("가전 제품 공장");     // 메서드 호출
    factory1.produce("백색 가전");         // 메서드 호출    
}
```
## 상속 구분
- 클래스 상속 -> extends
- 인터페이스 상속 -> implements

# 인터페이스(interface)
- Java 에서 클래스가 구현해야하는 '메서드들'의 집합을 정의하는 일종의 규약(protocol)
- 인터페이스는 메서드의 시그니처(메서드명, 리턴 타입, 매개변수 목록)만을 포함하며, 메서드의 실제 구현은 포함하지 않음
    - -> 추상 메서드와 유사한점
- 다중 상속을 지원 -> 이를 통해 클래스가 여러 인터페이스를 구현할 수 있음
    - 추상 클래스는 단일 상속을 지원하기 때문에 상속 과정을 알아보기 쉽다고 수업했는데 얘는 또 다중 상속을 지원

## 특징
1. `추상 메서드` : 인터페이스 내의 '모든 메서드'들은 기본적으로 추상 메서드
2. `상수` : 인터페이스 내에서 선언된 변수들은 모두 '자동으로' public static final 상수로 취급됨
3. `다중 상속` : 클래스는 여러 인터페이를 구현할 수 있음

## 추상 클래스와의 공통점
- 모든 추상 메서드를 포함할 수 있고, 이를 자식(서브) 클래스에서 구현해야만 한다.(오류 뜸)

## 추상 클래스와의 차이점
- **추상 클래스**
    1. `부분 구현 허용` - 추상 클래스는 추상 메서드 뿐만 아니라 일반 메서드도 포할 할 수 있다.
    2. `상태 저장 가능` - 추상 클래스는 '변수'를 가질 수 있다.
    3. `단일 상속` - 클래스는 하나의 추상 클래스만 상속 받을 수 있다
    4. `생성자` - 추상 클래스는 생성자를 가질 수 있다(익명 클래스 만들 때 기본 생성자를 사용)
    5. `다양한 접근 지정자` - 추상 클래스의 메서드와 변수는 다양한 접근 지정자를 가질 수 있다(저희는 private 사용)

- **인터페이스**
    1. `완전한 추상화` - 인터페이스는 기본적으로 모든 메서드가 추상 메서드
       (Java8 이후에 default / static 등 접근 지정자와 키워드를 사용 가능하긴 함)
    2. 인터페이는 인스턴스 변수(필드 중 객체마다 값이 다른 변수)를 가질 수 없고 '`상수만 선언 가능`'
       -> 상수는 선언과 동시에 초기화되어야하며 이후 값을 바꿀 수 없었습니다. 그래서 작성 방식이 일반 field 와는 차이가 있음
    3. `다중 상속` - 클래스는 여러 인터페이스를 '구현할 수 있다'(상속이라고 표현 하지 안한 이유가 있음)
    4. `생성자 없음` - 인터페이스는 생성자를 가질 수 없다 -> 필드에서 객체마다 다른 값을 지닐 수 없기 때문에 생성자를 정의할 필요도 없습니다.
    5. `자동 public` - 인터페이스의 메서드들은 자동으로 public 이며, 메서드 선언에 접근 지정자를 명시할 필요 X / 근데 default / static 메서드가
       Java8 이후에 생기긴 또 했습니다.

## 접근 지정자 명시하지 않을 시
- interface 이기 때문에 변수 앞에 접근 지정자를 명시하지 않을 시 `public final`에 해당
### 사례
```java
public interface Press {
    String NAME = "button";
    // 상수이기 때문에 상수명을 나타내는 'NAME' 으로 작성하였고, 일반 클래스의 field 선언 처럼 String name;으로 작성하는 것이 불가능 합니다.
    
    // 안되는 사례
    String name;
    public Press() {};
    void popOut() {
        System.out.println("추상 메서드만 가능/ 일반 메서드 불가능 예사");
    }

    // 되는 사례
    void onPressed();   // 아무 표시도 안했지만 abstract 입니다.
}
```

#### 💻사용 예시
1. `interface` `Up`의 `void onUp()` -> `String onUp()` 변경
2. abstract class 인 Button 에서 구현했을 때
```java
public abstract class Button implements Press, Down, Up { 
    @Override
    public String onUp(){
        return "올립니다.";
    }
}
```
로 수정

3. ChannelUpButton을
```java
public class ChannelUpButton extends Button {
    @Override
  public String onUp(){
        return "채널을 계속 " + super.onUp();
    }
}
```
로 수정

4. TvRemoteController 를
```java
public class TvRemoteController{
    public void onUpChannelUpButton() {
      System.out.print("Tv 의 ");
      channelUpButton.onUp();
    }
}
```
인데 얘를 Main에서 실행해보니까 TV의 까지만 뜨고 채널을 계속 올립니다가 안뜹니다.
어떻게 해결해야 할 까요?

5. TvRemoteController 수정안
```java
public class TvRemoteController{
    public void onUpChannelUpButton() {
        System.out.print("Tv의 ");
        System.out.println(channelUpButton.onUp());
    }
}
```
로 수정

