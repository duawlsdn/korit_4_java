# 상속(inheritance)
- `객체 지향 프로그램(OOP: Object-oriented Programming)`의 핵심 개념 중 하나로, 기존 클래스(부모(슈퍼)클래스)의 속성과 메서드를 재사용하여 새로운 클래스(자식(서브)클래스)를 만드는 것을 의미함
## 상속의 형식
```java
   // (자식)클래스명 extends (부모)클래스명
public class Tiger extends Animal{
```
## 상속의 필요성
- 상속을 통해 공통적인 기능을 부모클래스에 정의하고, 이를 '여러'자식 클래스가 재사용
    - ex) 동물(Animal) 클래스가 있고, 이를 상속 받는 개(Dog), 고양이(Cat) 클래스가 있다고 가정. 동물의 공통적인 속성(이름, 나이 등)과 행위(걷기, 먹기)를 부모 클래스에 정의, 개와 고양이는 각각 고유한 특성(짖기 / 울기 등)을 추가 가능
- 이상의 과정을 거쳤을 때 얻을 수 있는 이점 - 중복된 코드를 작성하지 않아도 됨
    - 즉 Dog 클래스에 이름, 나이 / Cat 클래스에 이름, 나이라는 field를 선언할 필요가 없고, 걷기, 먹기에 해당하는 메서드도 정의할 필요가 없음 -> 코드의 재사용성이 늘어남

## 상속의 특징
1. 단일 상속
- Java는 단일 상속만 지원함. 하나의 클래스는 한 번에 하나의 부모 클래스만 상속 받을 수 있어 상속 구조가 간단함.
2. `super` 키워드
    - 클래스의 생성자 및 setter 에서 학습한 this와 유사한 개념
    - 부모 클래스의 필드에 접근 하거나 부모 클래스의 생성자를 호출할 때 사용
3. `method override`
    - 자식 클래스에서 부모 클래스의 기본 동작을 _재정의_ 할 수 있음. 이를 통해 자식 클래스는 부모클래스의 기본 동작을 자신만의 방식으로 변경 가능
    - Animal 클래스의 걷기를 Dog가 상속 받고, 네 발로 걷기로 '재정의', Human 클래스가 상속받고 두 발로 걷기로 '재정의'
4. `final`키워드 - 클래스 / 메서드에 final을 사용하면 상속 제한
    - final 클래스 - 상속 자체가 불가능
    - final 메서드 - 메서드 오버라이딩 불가능
5. 부모 클래스 - 자식 클래스
    - 부모클래스는 자식 클래스의 필드 및 메서드에 접근 불가능
    - 부모의 필드를 그대로 사용할 수 있지만, 자식 클래스만의 고유한 필드를 가질 수 도 있습니다.
    - 부모에게 없는 필드 자식에게 있을 경우 고유 필드의 경우 메서드를 정의해줄 필요가 있음

### super 키워드의 두 가지 사용 방식
1. `super()` : 부모 클래스의 생성자를 호출하는 키워드 / 기본 생성자라면 () 내부에 아무런 값이 없고, 매개변수 생성자라면 () 내에 매개변수들이 포함
2. `super.메서드명()` : 부모 클래스의 메서드를 호출하는 키워드

#### 💻사용 예시 & 📃참고 패키지
- ch13_inheritance/Animal/Human/Main/Tiger
```java
/*
    1. Animal 클래스를 상속 받으시오.
    2. 기본 생성자를 이용해서 main 에서 human1 객체를 생성   -> 재정의가 요구
        - 기본생성자를 통해 Human 클래스의 인스턴스가 생성되었습니다. 라고 출력될 수 있도록 코드 작성
    3. setter를 활용하여 animalName에 여러분 이름 / animalAge에 여러분 나이를 작성
    4. getter를 재정의하여 getAnimalName();을 호출했을 때
        안녕하세요. 제 이름은 ??? 입니다. 라고 출력될 수 있도록 코드를 작성
    5. getter를 재정의하여 getAnimalAge();를 호출했을 때
        올해 제 나이는 ?살입니다. 내년에는 ?+1살이 됩니다. 라고 출력될수 있도록 코드 작성
    6. move() 메서드를 재정의하여
        사람이 두 발로 걷습니다. 라고 출력될 수 있도록 코드를 작성
    7. Human 클래스의 고유 메서드인 read() 메서드를 call2() 유형으로 정의
        human1.read("자바의 기초"); 라고 출력했을 시
        ???은 자바의 기초를 읽는 중입니다. 라고 출력될 수 있도록 코드를 작성

    실행 예
    기본생성자를 통해 Human 클래스의 인스턴스가 생성
    사람이 두 발로 걷습니다.
    안녕하세요. 제 이름은 ???입니다.
    올해 제 나이는 ?살입니다. 내년에는 ?+1살이 됩니다.
    ???은 자바의 기초를 읽는 중입니다.
 */
public class Human extends Animal {
    public Human() {
        System.out.println("기본생성자를 통해 Human 클래스의 인스턴스가 생성되었습니다.");
    }


    @Override
    public void move() {
        System.out.println("사람이 두 발로 걷습니다.");
    }

    @Override
    public String getAnimalName() {
        return "안녕하세요 제이름은 " + super.getAnimalName()+"입니다.";
    }

    @Override
    public void setAnimalName(String animalName) {
        super.setAnimalName(animalName);
    }

    @Override
    public int getAnimalAge() {
        // int 타입이여서 return 라인에 작성이 되지 않지만 이런 방식으로 활용 가능 밑 main 파트에서도 호출 방식 변경
        System.out.println("올해 제 나이는 "+ super.getAnimalAge() + "살 입니다. 내년에는 "+ (super.getAnimalAge()+1)+ "살이 됩니다.");
        return super.getAnimalAge();
    }

    @Override
    public void setAnimalAge(int animalAge) {
        super.setAnimalAge(animalAge);
    }

    public void read(String str){
        System.out.println(super.getAnimalName()+"은 " + str + "를 읽는 중입니다.");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal animal1 = new Animal();
        
        Human human1 = new Human();
        human1.move();
        human1.setAnimalName("염진우");
        human1.setAnimalAge(30);
        System.out.println(human1.getAnimalName());
        human1.getAnimalAge();
        human1.read("자바의 기초");

    }
}
```