

import java.awt.*;
import java.util.ArrayList;

public class transportCar<T extends PersonalCar> extends Truck{
    public int carDistance;
    public ArrayList <T> loadedCars = new ArrayList<T>(9);
    public final int maxCapacity = 9;


    public transportCar() {
        nrDoors = 2;
        color = Color.pink;
        enginePower = 1500;
        modelName = "Car transporter";
        double angle = 70;
        size = 20;
        
    }


    @Override   //om du vill höja den så blir den automatiskt stängd
    public void raise(int degrees) {
        degrees = 70;
        setAngle(degrees);

    }

    @Override   //Om du vill sänka den så blir den automatiskt 0
    public void lower(int degrees) {
        degrees = 0;
        setAngle(degrees);
    }


    public void loadCar(T car){
            if (angle == 0 && getCurrentSpeed() == 0 && carDistance <= 1 && car.getSize() < 6 && loadedCars.size() < maxCapacity) {

                loadedCars.add(car);
                carDistance = 0;
                x = car.getX();
                y = car.getY();
            }
            else {
                throw new IllegalArgumentException("Something is wrong!");
            }
        }

    public void deloadCar () {
        if (getAngle() == 0 && carDistance <= 1 && getCurrentSpeed() == 0) {
            loadedCars.removeLast();
            carDistance = 1;

        } else {
            throw new IllegalArgumentException("Something is wrong!");
        }
    }
    public void setCarDistance(){

    }



    }
