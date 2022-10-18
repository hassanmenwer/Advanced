package solid.isp;

import edu.najah.eng.solid.isp.interfaces.IMolt;
import edu.najah.eng.solid.isp.interfaces.ISwim;

public class Penguin implements ISwim, IMolt {
    String currentLocation;
    int numberOfFeathers;

    public Penguin(int initialFeatherCount) {
        this.numberOfFeathers = initialFeatherCount;
    }

    @Override
    public void molt() {
        this.numberOfFeathers -= 1;
    }

    @Override
    public void swim() {
        this.currentLocation = "in the water";
    }
}