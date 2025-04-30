# 오브젝트(Object)
1. `toString()`
- 클래스 이름과 해시코드(주소지라는 표현 사용)를 반환함 ->  override 하고 재정의하여 필드를 표현하는 등 다양한 방식으로 사용하는 편
    - 사람들이 읽기 편한 방식으로 재정의하고, '객체명만으로' 불러오는 것이 가능함.
    - 객체명.toString() 형태로 쓰지 않고, 객체명만으로 메서드를 호출하는 것이 가능
```java
public class Teacher {
    private String name;
    private String schoolName;

    public Teacher(String name, String schoolName) {
        this.name = name;
        this.schoolName = schoolName;
    }
    // setter / getter 생략...
    @Override
    public String toString() {
        return name +"선생님의 근무지는 " + schoolName + "학교 입니다.";
    }
}
```

2. `equals()`
- 두 객체가 '논리적으로 같은지'를 비교하는 메서드. 기본적으로 Object의 equals() 메서드는 두 객체의 참조 주소를 비교합니다.
    - 형식 : `객체명1.equals(객체명2)` -> 객체명1 과 객체명2의 참조 주소가 동일한지 확인
```java
public class Teacher {
    private String name;
    private String schoolName;

    public Teacher(String name, String schoolName) {
        this.name = name;
        this.schoolName = schoolName;
    }
    // setter / getter 생략...
    @Override
    // 객체명1.equals(객체명2)
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Teacher teacher = (Teacher) o;
        return Objects.equals(name, teacher.name) && Objects.equals(schoolName, teacher.schoolName);
    }
    // 객체명1.equals(객체명2)
}
```

3. `hashCode()`
- 객체를 정수값(해시값)으로 변환(16진수가 아니라). 해시 값은 주로 해시 기반 Collections 에서 사용됩니다.
  equals() 메서드를 override 하면 hashCode() 도 반드시 override 해야 합니다.
  동일한 객체는 동일한 해시 코드를 가져야하기 때문인데, 해시 코드가 같다고 해서 항상 equals()가 true가 아닐 때 도 있음
```java
public class Teacher {
    private String name;
    private String schoolName;

    public Teacher(String name, String schoolName) {
        this.name = name;
        this.schoolName = schoolName;
    }
    // setter / getter 생략...
    @Override
    public int hashCode() {
        return Objects.hash(name, schoolName);
    }
}
```

#### 💻코드 확인 사례
```java
public class TeacherMain {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("김일","에이");
        Teacher teacher2 = new Teacher("김일","에이");

        boolean result1 = teacher1.equals(teacher2);
        System.out.println(result1);        // true
        boolean result2 = teacher1 == teacher2;
        System.out.println(result2);        // false

        /*
            .equals()의 경우에는 주소지가 아니라 속성값이 서로 일치하는지를 확인
            == 의 경우에는 주소지까지 같은지를 확인
         */
        // 주소지를 확인
        System.out.println(teacher1);
        System.out.println(teacher2);

        String name = "김일";
        boolean result3 = name.equals("김일");
        System.out.println(result3);        // true
        boolean result4 = name == "김일";
        System.out.println(result4);        // true

        String name2 = new String("김일");
        boolean result5 = name.equals(name2);
        System.out.println(result5);        // true
        boolean result6 = name == name2;
        System.out.println(result6);        // false
        
        // .equals() 의 결과값 과 ==의 결과값은 항상 같지는 않다.
    }
}
```