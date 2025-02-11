import java.awt.*;

public abstract class Vehicle implements Movable {
    protected int nrDoors; // Number of doors on the car
    protected double enginePower; // Engine power of the car
    protected double currentSpeed; // The current speed of the car
    protected Color color; // Color of the car
    protected String modelName; // The car model name
    protected double x = 0;
    protected double y = 0; // Ändra sen om det ska från pub
    protected double currDirection = 0;
    protected static double size;

    public double getSize(){return size;}
    public double getX(){return x;}
    public double getY(){return y;}
    protected void setX(double xCoord){x = xCoord;}
    protected void sety(double yCoord){y = yCoord;}
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

    protected void setColor(Color clr){
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

    protected void incrementSpeed(double amount){
        currentSpeed = Math.min(getCurrentSpeed() + speedFactor() * amount,enginePower);
    }

    protected void decrementSpeed(double amount){
        currentSpeed = Math.max(getCurrentSpeed() - speedFactor() * amount,0);
    }

    protected double speedFactor() {
        return 1.0;
    }

    public void gas(double amount){
        if (amount < 0 || amount > 1)
            throw new IllegalArgumentException("0 <= amount <= 1");
        incrementSpeed(amount);
    }

    public void brake(double amount){
        if (amount < 0 || amount > 1)
            throw new IllegalArgumentException("0 <= amount <= 1");
        decrementSpeed(amount);
    }

}
