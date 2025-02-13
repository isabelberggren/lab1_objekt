import org.junit.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;

public class TestTruck {

    @Test
    public void testEngineAngleWhenAngleEqualsZero() {
        Scania truck = new Scania();
        for (int i = 0; i < 71; i++) {
            if (i == 0) {
                truck.raise(i);
                truck.startEngine();

                assertEquals(0.1, truck.getCurrentSpeed(), 0.01);
            } else {
                int finalI = i;
                assertThrows(IllegalArgumentException.class, () -> {
                    truck.setAngle(finalI);
                });
            }
        }
    }

    @Test
    public void testDeloadCar(){
        transportCar<Volvo240> truck = new transportCar<>();
        truck.loadCar(new Volvo240());
        truck.setAngle(0);
        truck.currentSpeed = 0;
        truck.carDistance = 1;
        truck.deloadCar();
        assertEquals(0, truck.loadedCars.size());

    }

    @Test
    public void testGarage() {
        Garage<Vehicle> g = new Garage<>();
        g.setMaxNmr(10);
        g.loadVehicle(new Scania());
        assertEquals(1, g.loadedVehicles.size());
    }


}
