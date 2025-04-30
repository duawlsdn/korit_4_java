# static
## 정의
- 클래스 수준(인스턴스 수준이 아니라)에서 변수를 정의하거나 메서드를 선언할 때 사용
- static 으로 선언된 변수나 메서드는 `클래스의 인스턴스에 속하지 않음`(즉,`객체의 고유값이 아니다.`)
- 클래스 자체에 속하게 됨
- 인스턴스를 생성하지 않고 접근이 가능하다는 점에서 인스턴스 변수, 메서드와 구분

## 특징
1. 클래스 수준의 변수 및 메서드 - static 변수와 메서드는 클래스 로드 시 메모리에 할당(객체가 생성될 때가 아니라)
2. 공유 - 모든 인스턴스가 동일한 static 변수에 접근합니다. 따라서 데이터를 공유하거나 상태를 저장할 때 유용

```java
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class KorItStudent4 extends KorItStudent {
    // static 변수 선언 및 초기화
    private static String staticCurriculum = "4월 국비";
    
    // 필드 선언
//    private String curriculum;
    private String name;
    private int age;
}

public class KorItStudent4Main {
    public static void main(String[] args) {
        KorItStudent4 student1 = new KorItStudent4("김일",20);
        KorItStudent4 student2 = new KorItStudent4("김이",21);
        KorItStudent4 student3 = new KorItStudent4("김삼",22);
        KorItStudent4 student4 = new KorItStudent4("김사",23);
    }
}
```
이상의 코드 블록의 경우 KorItStudent4로 생성되는 객체들은 `private static String staticCurriculum 변수`를 가지게 될겁니다.
즉 어느 클래스의 인스턴스 인지만 확인하더라도 몇 월 국비생인지를 확인할 수 있게 되겠죠(객체에 일일이 정의 X)

3. 인스턴스가 필요 없음 - 객체를 생성하지 않고도 클래스명.변수 / 클래스명.메서드명() 으로 접근이 가능

4. 메모리 효율성 - static 변수는 프로그램이 종료될 때까지 `한번만 메모리에 할당`하기 때문에 객체 생성시마다 메모리 할당이 빈번하게 일어나는
   인스턴스 변수에 비해 효율성이 좋습니다.(즉, **공유되는 속성이 있다면 static 변수를 적극적으로 도입하는 것이 효율적**)

### 💻사용 사례
- `인스턴스 변수 -> 객체에 종속 / 정적 변수 -> 클래스에 종속`
```java
import lombok.Getter;

@Getter // 클래스 레벨에서의 @Getter 는 static 메서드와 관계 X
public class Product {
    // 필드 선언
    // static 변수 선언 및 초기화

    @Getter // 필드 레벨에서의 @Getter 예시
    private static int count = 0;

    // 인스턴스 변수 선언 및 초기화
    private int instanceCount = 0;  // 필드에도 초기화 가능

    public Product(){
        System.out.println("Product 클래스의 인스턴스가 생성되었습니다.");
        count++;
        instanceCount++;
    }
}

public class ProductMain {
    public static void main(String[] args) {
        System.out.println(Product.getCount()); // 클래스명.메서드명()을 통한 getter
        Product product1 = new Product();
        System.out.println("count : " + Product.getCount());
        System.out.println("instanceCount : " + product1.getInstanceCount());

        Product product2 = new Product();
        System.out.println("count : " + Product.getCount());                    // 정적 메서드 호출
        System.out.println("instanceCount : " + product2.getInstanceCount());   // 일반 메서드 호출

        // ... 반복 부분 생략
    }
}
```
- 위 코드 블록에서 반복적으로 실행 시 `instanceCount(인스턴스 변수)`는 0 에서 1로 증가되는 결과만 나옴
- `count(정적 변수)`는 객체가 실행될 때 마다 계속 `count++` 적용, 객체 수 만큼 갱신
#### 사용사례 출력물
```terminaloutput
0
Product 클래스의 인스턴스가 생성되었습니다.
count : 1
instanceCount : 1
Product 클래스의 인스턴스가 생성되었습니다.
count : 2
instanceCount : 1
... 생략
```