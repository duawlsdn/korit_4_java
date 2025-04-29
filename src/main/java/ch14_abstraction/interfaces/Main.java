package ch14_abstraction.interfaces;

public class Main {
    public static void main(String[] args) {
        TvRemoteController tvRemoteController =
                new TvRemoteController(
                new PowerButton(),
                new ChannelDownButton(),
                new ChannelUpButton(),
                new VolumeDownButton(),
                new VolumeUpButton());

        tvRemoteController.onPressedPowerButton();

        /*
            이상의 결과값은 "전원을 켭니다."

            별개의 PowerButton 객체를 생성해서 메서드 호출 가능 하지만 별개의 state 를 가지기 때문에 중복된 값이 나올 수 있다.
            PowerButton powerButton = new PowerButton();
            powerButton.onPressed();      // 결과값 : 전원을 켭니다.
         */
        tvRemoteController.onPressedChannelDownButton();
        tvRemoteController.onDownChannelDownButton();

        tvRemoteController.onPressedChannelUpButton();
        tvRemoteController.onUpChannelUpButton();

        tvRemoteController.onPressedVolumeDownButton();
        tvRemoteController.onDownVolumeDownButton();

        tvRemoteController.onPressedVolumeUpButton();
        tvRemoteController.onUpVolumeUpButton();

    }
}
