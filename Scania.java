import java.awt.*;

public class Scania extends Vehicle{

    private int angle;

    public Scania(){
        nrDoors = 2;
        color = Color.orange;
        enginePower = 1500;
        modelName = "Scania";
        angle = 0;
        stopEngine();
        }


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
        @Override
        public void startEngine(){
            int truckBedAngle = getAngle();

            if (truckBedAngle == 0) {currentSpeed = 0.1;}

            else{throw new IllegalArgumentException("Angle must be 0 to start the engine");}
        }


}





