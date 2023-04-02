public class Iphone implements SmartphoneBehaviour{
    @Override
    public void call(String Numar) {
        System.out.println("Iphone is calling "+Numar+"...");
    }

    @Override
    public void charge() {
        System.out.println("Iphone is charging...");
    }

    @Override
    public void takeScreenShoot() {
        System.out.println("Iphone is taking a screenshoot...");
    }

    @Override
    public void downloadApp(String appName) {
        System.out.println("Iphone is downloading "+appName+" application...");
    }
}
