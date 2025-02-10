

import java.awt.*;
import java.util.Stack;

public class transportCar extends Truck{
    private final int maxLoadedCars = 6;
    private int carDistance;
    private ArrayList<Vehicle> loadedCars = new ArrayList<>();


    public transportCar() {
        nrDoors = 2;
        color = Color.pink;
        enginePower = 1500;
        modelName = "Car transporter";
        double angle = 0;
        stopEngine();

        loadedCars = new Stack<>();
        
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

    //bilar kan endast lastas om rampen är nere och befinner sig rimligt nära transporten OCJ EJ ÄR EN TRASNPORTBIL
    public void loadCar(){
        if (angle == 0 && getCurrentSpeed() == 0 && carDistance <= 1 && !(car instanceof transportCar)){
            loadedCars.add(car);
            carDistance = 0;
        }


        }

    public void deloadCar(){
        if(getAngle() == 0 && carDistance <= 1){
             Vehicle car = loadedCars.remove(loadedCars.size() - 1);
             carDistance = 1;

        }
        else{
            throw new IllegalArgumentException("Rampen måste vara nere!")
        }
        //då hamnar de rimligt nära biltransporten och bakifrån som de kördes in
            }


    //bilar kan endast lossas om ramoen är nere, de bör då hamna rimligt nära biltrasnporten

    //bilar kan endast lossas i omvändordning från hur de lastas

    //samma x, y som la trasnportation car.
}
