package PhonesTypes;

public class Nokia implements TelephoneBehaviour{
    @Override
    public void call(String Numar) {
        System.out.println("Nokia is calling "+Numar+"...");
    }

    @Override
    public void charge() {
        System.out.println("Nokia is charging...");
    }
}
