public class Main {
    public static void main(String[] args){
        Phone iphone20SUPERMAX = new Phone();

        iphone20SUPERMAX.unlock("1234");
        iphone20SUPERMAX.powerOff();
        iphone20SUPERMAX.powerOn();
        iphone20SUPERMAX.unlock("1234");
        iphone20SUPERMAX.openEmailApp();

        iphone20SUPERMAX.emergencyMode();
    }
}
