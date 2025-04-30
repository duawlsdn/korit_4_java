package ch14_abstraction.interfaces;
/*
     인터페이스는 다중 상속이 가능하다는 점을 보일 클래스
     클래스 상속 -> extends
     인터페이스 상속 -> implements
 */
public abstract class Button implements Up,Down,Press{
    @Override
    public void onDown(){};

    @Override
    public abstract void onPressed();

    @Override
    public String onUp(){
        return "올립니다.";
    };
}
