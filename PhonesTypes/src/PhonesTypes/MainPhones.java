package PhonesTypes;

public class MainPhones {
    public static void main(String[] args) {
        Nokia nokia=new Nokia();
        Motorola motorola=new Motorola();
        Samsung samsung=new Samsung();
        Iphone iphone=new Iphone();

        nokia.charge();
        nokia.call("0722.123.456");

        motorola.charge();
        motorola.call("0733.123.456");

        samsung.charge();
        samsung.call("0744.123.456");
        samsung.downloadApp("Angry Birds");
        samsung.takeScreenShoot();

        iphone.charge();
        iphone.call("0755.123.456");
        iphone.takeScreenShoot();
        iphone.downloadApp("Netflix");
    }
}
