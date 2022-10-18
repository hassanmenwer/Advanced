package solid.dip;

import edu.najah.eng.solid.dip.devices.Keyboard;
import edu.najah.eng.solid.dip.devices.Monitor;

public class WindowsMachine {

    public final Keyboard keyboard;
    public final Monitor monitor;

    public WindowsMachine(){
        monitor = new Monitor();  //instance of monitor class
        keyboard = new Keyboard(); //instance of keyboard class
    }


    public void changeKeyboardStatus(boolean status){
        if (status){
            keyboard.on();
        } else {
            keyboard.off();
        }
    }

    public void changeMonitorStatus(boolean status){
        if (status){
            monitor.on();
        } else {
            monitor.off();
        }
    }



}