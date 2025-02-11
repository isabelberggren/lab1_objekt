import java.util.ArrayList;
import java.util.List;

public class Garage<T extends Vehicle> {
    T t;
    private int maxNmr;
    public List<T> acceptedModels = new ArrayList<>(); //Listan med godkända modeller
    public List<T> loadedVehicles = new ArrayList<T>(maxNmr);      //bilar i garaget

    public void setMaxNmr(int max) {
        maxNmr = max;
    }

    public int getMaxNmr() {
        return maxNmr;
    }

    public void setAcceptedModels(T car) {
        acceptedModels.add(car);
    }

    public List<T> getAcceptedModels() {
        return acceptedModels;
    }


    public void loadVehicle(T car) {
        if (loadedVehicles.size() >= maxNmr) {
            throw new ArrayStoreException("Already full garage");
        } else if (acceptedModels.isEmpty()) {
            loadedVehicles.add(car);
        } else if (!(acceptedModels.contains(car))) {
            throw new UnsupportedOperationException("YOU'RE NOT WELCOME HERE");
        } else {
            loadedVehicles.add(car);
        }
    }
}

