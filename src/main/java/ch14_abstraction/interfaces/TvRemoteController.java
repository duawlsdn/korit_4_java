package ch14_abstraction.interfaces;

public class TvRemoteController {
    // field 선언
    private PowerButton powerButton;
    private ChannelDownButton channelDownButton;
    private ChannelUpButton channelUpButton;
    private VolumeDownButton volumeDownButton;
    private VolumeUpButton volumeUpButton;

    public TvRemoteController(PowerButton powerButton, ChannelDownButton channelDownButton, ChannelUpButton channelUpButton, VolumeDownButton volumeDownButton, VolumeUpButton volumeUpButton) {
        this.powerButton = powerButton;
        this.channelDownButton = channelDownButton;
        this.channelUpButton = channelUpButton;
        this.volumeDownButton = volumeDownButton;
        this.volumeUpButton = volumeUpButton;
    }

    // 이상의 field 들을 이용한 메서드들 정의
    public void onPressedPowerButton(){
        System.out.print("Tv의 ");
        powerButton.onPressed();
    }

    public void onPressedChannelDownButton() {
        System.out.print("Tv의 ");
        channelDownButton.onPressed();
    };

    public void onDownChannelDownButton() {
        System.out.print("Tv의 ");
        channelDownButton.onDown();
    };

    public void onPressedChannelUpButton() {
        System.out.print("Tv의 ");
        channelUpButton.onPressed();
    };

    public void onUpChannelUpButton() {
        System.out.print("Tv의 ");
        System.out.println(channelUpButton.onUp());
    };
    // VolumeDownButton / VolumeUpButton 클래스를 만들고 ChannelDown / Up 과 같은 방식으로 작성
    // VolumeUpButton은 작성 X
    public void onPressedVolumeDownButton(){
        System.out.print("Tv의 ");
        volumeDownButton.onPressed();
    }

    public void onDownVolumeDownButton(){
        System.out.print("Tv의 ");
        volumeDownButton.onDown();
    }

    public void onPressedVolumeUpButton(){
        System.out.print("Tv의 ");
        volumeUpButton.onPressed();
    }

    public void onUpVolumeUpButton(){
        System.out.print("Tv의 ");
        System.out.println(volumeUpButton.onUp());
    }

}
