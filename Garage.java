import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public abstract class Garage implements Load{
    protected List<Vehicle> acceptedCars = new ArrayList<>();
    protected int nrCars;
    protected String model;
    public int getNrCars() {return nrCars;}
    public String getModelName() {return model;}

    public void loadCar(Vehicle car){
        if (!Objects.equals(car.modelName, getModelName())){
        throw new IllegalArgumentException("This model is not accepted here.");}

    }

    public void pickUpCar() {

    }

}
