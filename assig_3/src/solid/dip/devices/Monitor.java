package solid.dip.devices;

public class Monitor implements Switch {

    public void on(){
        System.out.println("Turn on " + this.getClass().getName());
    }

    public void off(){
        System.out.println("Turn off " + this.getClass().getName());
    }

}