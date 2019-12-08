public class Phone {
    private PhoneState phoneState;

    public Phone(){
        this.phoneState = new PoweredOffState();
    }

    public void unlock(String password){
        if(password == "1234"){
            this.phoneState = new UnlockedState();
        }
        else{
            System.out.println("Wrong password");
        }
    }

    public void powerOn(){
        this.phoneState = new LockedState();
    }

    public void powerOff(){
        this.phoneState = new PoweredOffState();
    }

    public void openEmailApp(){
        if(this.phoneState instanceof UnlockedState){
            System.out.println("Email app opened");
        }
        else{
            System.out.println("It cannot be done without phone being unocked");
        }
    }
}
