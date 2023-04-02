public class Motorola implements TelephoneBehaviour{
    @Override
    public void call(String Numar) {
        System.out.println("Motorola is calling "+Numar+"...");
    }

    @Override
    public void charge() {
        System.out.println("Motorola is charging...");
    }
}
