package kz.onggar.pattern.command;

public class TV {
    private boolean switchedOn;

    public void on(){
        switchedOn = true;
        System.out.println("TV on");
    }

    public void off(){
        switchedOn = false;
        System.out.println("TV off");
    }

    public void decreaseSound(){
        System.out.println("Decreased");
    }

    public void increaseSound(){
        System.out.println("Increased");
    }

    public boolean isSwitchedOn() {
        return switchedOn;
    }

    public void setSwitchedOn(boolean switchedOn) {
        this.switchedOn = switchedOn;
    }
}
