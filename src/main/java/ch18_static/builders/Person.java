package ch18_static.builders;


public class Person {
    private String name;
    private int age;
    private String address;

    // 빌더 패턴
    private Person(Builder builder){
        this.name = builder.name;
        this.age = builder.age;
        this.address = builder.address;
    }

    public static class Builder{
        private String name;
        private int age;
        private String address;

        // 이하의 코드에 주목 -> method 들을 정의
        // method 는 대부분 행위를 나타내기 때문에 동사로 작성하지만 Builder 패턴에서는 대입될 필드의 이름과 동일한 메서드명을 씁니다.
        // 예를 들어 builder.name("염진우"); / builder.age(30); 과 같은 방식
        public Builder name(String name){               // call4() 유형
            this.name = name;
            return this;
        }

        public Builder age(int age){
            this.age = age;
            return this;
        }

        public Builder address(String address){
            this.address = address;
            return this;
        }

        // 이상까지의 코드는 Person 클래스의 필드와 관련있는 메서드
        // 이제 객체 생성을 완료하는 메서드 정의 -> 기본적으로 build() 라고 짓습니다.
        public Person build(){
            return new Person(this);
        }
    }
}
