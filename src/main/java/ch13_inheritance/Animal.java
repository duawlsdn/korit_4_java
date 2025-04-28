package ch13_inheritance;

public class Animal{
    // 필드 생성
    private String animalName;
    private int animalAge;

    // 기본 생성자 및 매개변수 생성자(하나짜리 두개 / 두개짜리 하나)
    public Animal() {
    }
    public Animal(String animalName) {
        this.animalName = animalName;
    }
    public Animal(int animalAge) {
        this.animalAge = animalAge;
    }
    public Animal(String animalName, int animalAge) {
        this.animalName = animalName;
        this.animalAge = animalAge;
    }

    // setter / getter
    public String getAnimalName() {
        return animalName;
    }
    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }
    public int getAnimalAge() {
        return animalAge;
    }
    public void setAnimalAge(int animalAge) {
        this.animalAge = animalAge;
    }

    // 고유메서드
    public void move(){
        System.out.println("움직 입니다.");
    }
}
