package solid.isp;

import edu.najah.eng.solid.isp.interfaces.IFly;
import edu.najah.eng.solid.isp.interfaces.IMolt;

public class Eagle implements IFly, IMolt {

    String currentLocation;
    int numberOfFeathers;

    public Eagle(int initialFeatherCount) {
        this.numberOfFeathers = initialFeatherCount;
    }

    @Override
    public void fly() {
        this.currentLocation = "in the air";
    }

    @Override
    public void molt() {
        this.numberOfFeathers -= 1;
    }
}