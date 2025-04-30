package ch18_static.builders;

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
