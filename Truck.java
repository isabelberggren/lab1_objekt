import java.awt.*;

public class Truck extends Vehicle {

    public Truck() {
        nrDoors = 2;
        color = Color.orange;
        enginePower = 1500;
        modelName = "Car transporter";
        angle = 0;
        position = 0;
        stopEngine();
    }

    public void englishboy() {
        if (getCurrentSpeed() == 0) {

        }

        else {throw new IllegalArgumentException("The vehicle must stand still your stupied")
    }
}

}

