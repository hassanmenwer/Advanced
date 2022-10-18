package solid.dip.devices;

public class Keyboard implements Switch{

    @Override
    public void on() {
        System.out.println("Power on " + this.getClass().getName());
    }

    @Override
    public void off() {
        System.out.println("Power off " + this.getClass().getName());
    }
}