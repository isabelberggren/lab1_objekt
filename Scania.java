import java.awt.*;

public class Scania extends Vehicle{

    private int scaniaAngle;

    public Scania(){
        nrDoors = 2;
        color = Color.orange;
        enginePower = 1500;
        modelName = "Scania";
        scaniaAngle = 0;
        stopEngine();
        }


        public int getAngle(){return scaniaAngle;}

        public void setAngle(int angle){
            if (angle >= 0 && 70 >=angle){
                this.scaniaAngle = angle;
            }
            else{throw new IllegalArgumentException("Angle should be between 0 and 70 degrees");}
    }



'
}
