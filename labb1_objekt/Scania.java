package labb1_objekt;
import java.awt.*;

public class Scania extends Truck{

    private TruckBed bed;

    public Scania(){
        super(new TruckBed());

        nrDoors = 2;
        color = Color.orange;
        enginePower = 1500;
        modelName = "Scania";
        bed = new TruckBed();
        bed.setAngle(0, getCurrentSpeed());
        size = 10;
        stopEngine();
        }

}





