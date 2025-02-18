package labb1_objekt;
import java.awt.*;

public class Saab95 extends Vehicle implements PersonalCar{

    private boolean turboOn;

    
    public Saab95(){
        nrDoors = 2;
        color = Color.red;
        enginePower = 125;
	    turboOn = false;
        modelName = "Saab95";
        size = 4.30;
        stopEngine();

    }
    public void setTurboOn(){
        turboOn = true;
    }

    public void setTurboOff(){
        turboOn = false;
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

    @Override
    public double getY() {
        return super.getY();
    }



    @Override
    protected double speedFactor(){
        double turbo = 1;
        if(turboOn) turbo = 10.3;
        return enginePower * 0.01 * turbo;
    }

    @Override
    public double getSize() {
        return super.getSize();
    }
}
