public class PoweredOffState implements  PhoneState{

    public PoweredOffState(){
        this.message();
    }
    @Override
    public void message() {
        System.out.println("The phone is powered off");
    }
}
