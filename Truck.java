import java.awt.*;

public abstract class Truck extends Vehicle {

    protected static int angle;


    protected static int getAngle(){return angle;}

    public static void setAngle(int ang) {
        double speed = getCurrentSpeed();
        if (speed == 0) {
            if (angle >= 0 && 70 >= angle) {
                angle = ang;
            } else {
                throw new IllegalArgumentException("Angle should be between 0 and 70 degrees");
            }
        } else {
            throw new IllegalArgumentException("Speed must be 0 to change angle");
        }
    }

    public void raise(int degrees){
        HelpRaiseLower.Raise(degrees);
        }

    public void lower(int degrees){
        HelpRaiseLower.Lower(degrees);
    }

    @Override
    public void startEngine(){
        int truckBedAngle = getAngle();

        if (truckBedAngle == 0) {currentSpeed = 0.1;}

        else{throw new IllegalArgumentException("Angle must be 0 to start the engine");}



    }

}


