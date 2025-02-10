import java.awt.*;

public abstract class Truck extends Vehicle {

    protected int angle;


    public int getAngle(){return angle;}

    public void setAngle(int ang) {
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
        int ang = getAngle();
        int newang = ang + degrees;
        if ( newang > 70){
            throw new IllegalArgumentException("To high raise");}

        setAngle(newang);

        }

    public void lower(int degrees){
        int ang = getAngle();
        int newang = ang - degrees;
        if ( newang < 0){
            throw new IllegalArgumentException("To high lowering");}

        setAngle(newang);



    }

    @Override
    public void startEngine(){
        int truckBedAngle = getAngle();

        if (truckBedAngle == 0) {currentSpeed = 0.1;}

        else{throw new IllegalArgumentException("Angle must be 0 to start the engine");}



    }

}


