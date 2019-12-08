public class EmergencyMode implements PhoneState {

    public EmergencyMode(){
        this.message();
    }

    @Override
    public void message() {
        System.out.println("Callling 911");
    }
}
