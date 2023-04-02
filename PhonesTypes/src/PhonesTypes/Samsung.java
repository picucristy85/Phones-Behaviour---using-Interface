package PhonesTypes;

public class Samsung implements SmartphoneBehaviour{
    @Override
    public void call(String Numar) {
        System.out.println("Samsung is calling "+Numar+"...");
    }

    @Override
    public void charge() {
        System.out.println("Samsung is charging...");
    }

    @Override
    public void takeScreenShoot() {
        System.out.println("Samsung is taking a screenshoot...");
    }

    @Override
    public void downloadApp(String appName) {
        System.out.println("Samsung is downloading "+appName+" application...");
    }
}
