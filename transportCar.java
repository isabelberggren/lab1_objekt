

import java.awt.*;
import java.util.ArrayList;

public class transportCar extends Truck{
    private final int maxLoadedCars = 6;
    private int carDistance;
    private ArrayList <Vehicle> loadedCars = new ArrayList<Vehicle>(9);
    private int maxCapacity = 9;


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

        //bilar kan endast lastas om rampen är nere och befinner sig rimligt nära transporten OCJ EJ ÄR EN TRASNPORTBIL

    public void loadCar(Vehicle car){
            if (angle == 0 && getCurrentSpeed() == 0 && carDistance <= 1 && Vehicle.size < 6 && loadedCars.size() < maxCapacity) {
                loadedCars.add(car);
                carDistance = 0;
                car.x = x;
                car.y = y;
            }
            else {
                throw new IllegalArgumentException("The ramp needs to be down!");
            }
        }

        public void deloadCar () {
            if (getAngle() == 0 && carDistance <= 1 && getCurrentSpeed() == 0) {
                Vehicle car = loadedCars.removeLast();
                carDistance = 1;

            } else {
                throw new IllegalArgumentException("The ramp needs to be down!");
            }
        }
    }
