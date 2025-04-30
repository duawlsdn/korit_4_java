# 빌더 패턴(Builder Pattern)
## 정의
- 객체의 정의 과정에서 '복잡한 생성자'를 대신하여 객체를 단계적으로 생성할 수 있도록 도와주는 디자인 패턴(Design Pattern).
- GOF(Gang Of Four) 디자인 패턴 중 하나로 객체 '생성'시 가독성과 유연성을 제공하는 것이 목표
## 특징
1. 객체를 생성하는 여러 개의 필드를 '명시적'으로 관리할 수 있음
2. 불필요한 생성자 오버로딩을 줄여 가독성을 높임
3. '체이닝 메서드'를 사용하여 객체를 직관적으로 생성
```java
public class Student {
    String name;
    String schoolName;
    int studentCode;
    
    public Student() {}                                                         // 생성자 오버로딩 # 1
    public Student(String name){this.name = name;}                              // 생성자 오버로딩 # 2
//    public Student(String schoolName){this.schoolName = schoolName;} -> 오류 발생
    public Student(String name, String schoolName, int studentCode){            // 생성자 오버로딩 # 3
        this.name = name;
        this.schoolName = schoolName;
        this.studentCode = studentCode;
    }
}

public class StudentMain{
    public static void main(String[] args) {
        Student student1 = new Student("김일","빌더패턴",20250430);
    }
}
```
## 빌더 패턴이 생기게 된 원인
1. 복잡한 생성자 문제
    - 객체의 필드가 많아 질수록 생성자의 매개변수 수도 늘어남
2. 생성자 오버로딩 문제
    - 생성자에 필요한 조합이 다를 경우 수 많은 생성자를 하나하나 정의해야 함(롬복도 한계가 있음)
    - 유지 보수에 악영향 / 필드 하나 추가하면 생성자를 하나하나 뜯어고쳐야 함
3. 가독성과 유지 보수 문제
    - 코드를 작성하고 읽는 입장에서는 객체를 생성할 때 어떤 값이 어떤 필드에 해당하는지 명확하지 않아서 실수를 유발할 가능성 ↑

### 💻사용 사례
- Builder 패턴의 기본 골자
```java
public class Person {
    private String name;
    private int age;
    private String address;
    
    // Person 클래스의 필드와 관련있는 메서드
    private Person(Builder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.address = builder.address;
    }

    public static class Builder {
        private String name;
        private int age;
        private String address;

        // method 들을 정의, call4() 유형
        // method 는 대부분 행위=>(동사로 작성), Builder 패턴에서는 대입될 필드의 이름과 동일한 메서드명
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public Builder address(String address) {
            this.address = address;
            return this;
        }

        // 객체 생성을 완료하는 메서드 정의 -> 기본적으로 build()
        public Person build() {
            return new Person(this);
        }
    }
}

public class PersonMain {
    public static void main(String[] args) {
        // 생성자 방식
        Person person1 = new Person("김일",21, "서울특별시 종로구");
        
        // 빌더 방식
        Person person1 = new Person.Builder().name("김일").age(21).address("서울특별시 종로구").build();
        Person person2 = new Person.Builder().age(20).name("김이").build();   // 순서를 바꾸거나, 생략하더라도 코드를 추가할 필요 X
        Person person3 = new Person.Builder().build();
    }
}
```

### Builder Pattern(Lombok)
```java
import lombok.Builder;
import lombok.ToString;

@Builder
@ToString
public class PersonLombok {
    private String name;
    private int age;
    private String address;
}

public class PersonLombokMain {
    public static void main(String[] args) {
        PersonLombok personLombok1 = PersonLombok.builder()
                .name("김일")
                .age(21)
                .address("부산시")
                .build();
        System.out.println(personLombok1);
    }
}
```