public class UnlockedState implements PhoneState {

    public UnlockedState(){
        this.message();
    }
    @Override
    public void message() {
        System.out.println("The phone is unlocked");
    }
}
