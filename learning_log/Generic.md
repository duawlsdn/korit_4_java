# 제네릭(Generic)
## 개념 및 정의
- 클래스나 메서드가 다룰 데이터 타입을 미리 명시하여 재사용성과 유연성을 높이는 기술

### 타입 매개변수(Type Parameter)
- 클래스나 메서드에서 사용할 실제 타입을 '대신하여' 사용하는 매개변수
- 일반적으로 알파벳 대문자 하나로 표기함
    - `T`(Type) - 일반적으로 클래스 타입을 나타낼때 사용
    - `E`(Element) - 컬렙션의 요소(element)를 나타낼 때 사용
    - `K`(Key) - Map의 key를 나타낼 때 사용
    - `V`(Value) - Map의 value 또는 제네릭 타입의 반환값으로 사용

### 재사용성
- 제네릭을 사용하면 다양한 자료형에 대해 하나의 클래스나 메서드를 정의할 수 있어 코드의 재사용성을 높이고 중복을 줄입니다.

### 타입 안정성(Type Safety)
- 컴파일 시점에 타입 체크를 할 수 있어 프로그램의 안정성을 높이고, 명시적인 형변화(casting)을 줄임

### 💻사용 사례
```java
import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class ResponseData<T> {
    private String massage;
    private T data;

    @Override
    public String toString() {
        return massage + data;
    }
}

import java.util.Date;

public class DataController {
    public static void main(String[] args) {
        Date now = new Date();
        ResponseData<String> responseData1 = new ResponseData<>("날짜 저장 성공 : ",now.toString());
        // 근데 <T> 에서 T가 클래스이기 때문에 기본 자료형이 못들어갑니다. 즉, int 는 안되고 Integer 는 가능
        ResponseData<Integer> responseData2 = new ResponseData<>("나이 저장 성공 : ",20);
        ResponseData<Date>  responseData3 = new ResponseData<>("날씨 객체 저장 성공 : ", now);

        System.out.println(responseData1);
        System.out.println(responseData2);
        System.out.println(responseData3);
    }
}
```

- 20250430.md 파일 Lombok 파트에서 `@Data` 는 종합 애너테이션을 설명
  - `@ToString` 또한 포함되어 있지만 좀 더 가시성이 좋기 위해 재정의

### 출력 결과
```terminaloutput
날짜 저장 성공 : Wed Apr 30 17:21:35 KST 2025
나이 저장 성공 : 20
날씨 객체 저장 성공 : Wed Apr 30 17:21:35 KST 2025
```