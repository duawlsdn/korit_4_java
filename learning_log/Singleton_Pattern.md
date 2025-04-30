# 싱글톤(Singleton Pattern)
## 정의
- 소프트웨어 '디자인 패턴' 중 하나
- 어떤 클래스가 하나의 인스턴스만 갖도록 보장, 그 인스턴스에 접근할 수 있는 전역적인 접근법을 제공하는 패턴
  - ex) 데이터베이스 연결과 같은 리소스는 프로그램 전체에서 하나의 인스턴스만 사용해야 할 때가 많기 때문에 싱글톤 패턴을 사용함

## 특징
1. 하나의 인스턴스만 존재 - 하나의 인스턴스만 생성되고, 이 인스턴스는 프로그램이 실행되는 동안 유지
2. 전역 접근법 - 싱글톤 인스턴스는 정적(static) 메서드를 통하여 어디서든 접근 가능
    - `객체명.메서드명() X` / `클래스명.메서드명()`
3. 인스턴스의 생명 주기 관리 - 클래스 자체가 인스턴스 생성을 관리하므로, 다른 객체들이 인스턴스를 생성하거나 폐기 할 수 없음.


### 싱글톤 예시 사진
![싱글톤이미지](/learning_log/singletonImg.png)

### 💻사용 사례
- 형식
  - 예시) 정적 변수 선언 -> `자료형 =  ProductView` , `변수명 = instance`
```java
public class ProductView {
    // 보통 싱글톤 생성할 때 정적 변수 이름이 instance 입니다. (시험 시 힌트 중 하나)
    private static ProductView instance;

    // 일반적인 생성자 작성 방식과의 차이점
    private ProductView() {
        int counter = 1;                    // 일종의 지역변수 선언
        System.out.println(counter + " 번 째 객체가 생성되었습니다.");
        counter++;
    }

    // 정적 메서드를 정의 -> 싱글톤에서 대부분의 경우 메서드명 getInstance() -> 시험시 힌트
    public static ProductView getInstance(){
        if(instance == null){               // 현재 인스턴스가 없다면 해당 조건문 실행
            instance = new ProductView();   // ProductView 의 객체가 생성되고,
        }                                   // 그 객체를 정적 변수인 instance 에 대입
        return instance;                    // 그 이후에 getInstance() 메서드 실행시에는
    }                                       // 최초 생성된 객체가 계속 return 됨.

    public void showMainView() {
        System.out.println("상품 정보를 보여주는 메인 화면");
    }

    public void showOrderView() {
        System.out.println("주문 정보를 보여주는 화면");
    }
}

public class ProductViewMain {
    public static void main(String[] args) {
//        ProductView productView1 = new ProductView();
//        ProductView productView2 = new ProductView(); // private 선언 후에는 오류 발생
//        productView1.counter;                         // 접근 불가

        // 생성자를 private 처리를 했고, getInstance() 메서드 내에서 instance 정적 변수가 null 이라면
        // instance = new ProductView(); 하기로 정의했었기 때문에 main 단계에서 저희는
        // ProductView.getInstance();를 통해 객체 생성
        ProductView productView1 = ProductView.getInstance();
        ProductView productView2 = ProductView.getInstance();
        ProductView productView3 = ProductView.getInstance();
        ProductView productView4 = ProductView.getInstance();
        // 위 4줄의 결과값 : 1 번 째 객체가 생성되었습니다.
        /*
            이상의 코드에서 복수의 객체를 생성한 것처럼 보이지만 실제로
            ProductView.getInstance(); 의 결과값은 동일한 instance 입니다.(확인 필요)
            그렇다면 실제 생성된 객체의 수는 '1개' 입니다.
            그리고 그 한개를 다른 객체 이름에 대입했을 뿐
         */
        productView1.showMainView();
        productView3.showOrderView();
    }
}
```
### 출력 결과
```terminaloutput
1 번 째 객체가 생성되었습니다.
상품 정보를 보여주는 메인 화면
주문 정보를 보여주는 화면
```
- "1 번 째 객체가 생성되었습니다." 가 반복적으로 4번 나오는 것이 아니라 1번만 출력
  - 정적 메서드 정의에서 instance 가 null 이면 객체를 생성하지만 생성되 이후는 null이 아니기 때문에 1번만 생성 