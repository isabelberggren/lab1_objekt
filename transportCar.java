

import java.awt.*;
import java.util.ArrayList;

public class transportCar<T extends PersonalCar> extends Truck {
    protected int carDistance;
    private final ArrayList <T> loadedCars = new ArrayList<T>(9);


    public transportCar() {
        nrDoors = 2;
        color = Color.pink;
        enginePower = 1500;
        modelName = "Car transporter";
        double angle = 70;
        size = 20;
    }

    public void open() {
        HelpRaiseLower.Raise(70);

    }
    //Om du vill sänka den så blir den automatiskt 0
    public void close() {
        HelpRaiseLower.Lower(0);
    }


    public void loadCar(T car){
        int maxCapacity = 9;
        if (angle == 0 && getCurrentSpeed() == 0 && carDistance <= 1 && car.getSize() < 6 && loadedCars.size() < maxCapacity) {

                loadedCars.add(car);
                carDistance = 0;

            }
            else {
                throw new IllegalArgumentException("Something is wrong!");
            }
        }

    public void deloadCar(){
        if (getAngle() == 0 && carDistance <= 1 && getCurrentSpeed() == 0) {
            loadedCars.removeLast();
            carDistance = 1;

        } else {
            throw new IllegalArgumentException("Something is wrong!");
        }
    }

    @Override
    public void move(){
        if (currDirection == 0) y += currentSpeed;
        else if (currDirection == 180) y -= currentSpeed;
        else if (currDirection == 90) x += currentSpeed;
        else if (currDirection == 270) x -= currentSpeed;
        for (T car : loadedCars ){
            double y =  getY();
            double x = getX();
            car.setY(y);
            car.setX(x);
        }
    }
    }
