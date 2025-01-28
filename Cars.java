import java.awt.*;

public abstract class Cars implements Movable{
    protected int nrDoors; // Number of doors on the car
    protected double enginePower; // Engine power of the car
    protected double currentSpeed; // The current speed of the car
    protected Color color; // Color of the car
    protected String modelName; // The car model name
    public double x = 0;
    public double y = 0; // Ändralic sen om det ska från pub
    public double currDirection = 0;

    public int getNrDoors(){
        return nrDoors;
    }
    public double getEnginePower(){
        return enginePower;
    }

    public double getCurrentSpeed(){
        return currentSpeed;
    }

    public Color getColor(){
        return color;
    }

    public void setColor(Color clr){
        color = clr;
    }

    public void startEngine(){
        currentSpeed = 0.1;
    }

    public void stopEngine(){
        currentSpeed = 0;
    }

    public void move(){
        if (currDirection == 0) y += currentSpeed;
        else if (currDirection == 180) y -= currentSpeed;
        else if (currDirection == 90) x += currentSpeed;
        else if (currDirection == 270) x -= currentSpeed;

    }

    public void turnLeft(){
        currDirection = (currDirection-90)%360;
    }


    public void turnRight(){
        currDirection = (currDirection+90)%360;
    }

}
