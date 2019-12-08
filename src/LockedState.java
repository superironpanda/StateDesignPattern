public class LockedState implements PhoneState{

    public LockedState(){
        this.message();
    }
    
    @Override
    public void message() {
        System.out.println("The phone is locked");
    }
}
