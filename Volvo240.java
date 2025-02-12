import java.awt.*;

public class Volvo240 extends Vehicle implements PersonalCar{

    private final static double trimFactor = 1.25;

    
    public Volvo240(){
        nrDoors = 4;
        color = Color.black;
        enginePower = 100;
        modelName = "Volvo240";
        stopEngine();
        size = 4.87;
    }

    @Override
    protected double speedFactor(){
        return enginePower * 0.01 * trimFactor;
    }

    @Override
    public void setX(double xCoord) {
        super.setX(xCoord);
    }

    @Override
    public void setY(double yCoord) {
        super.sety(yCoord);
    }

    @Override
    public double getX() {
        return super.getX();
    }

}
