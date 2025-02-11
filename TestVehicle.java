import org.junit.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;

public class TestVehicle {

    @Test
    public void testColor(){
        Vehicle c = new Saab95();
        c.setColor(Color.BLUE);
        assertSame(Color.BLUE, c.getColor());
    }

    @Test
    public void testStartEngine(){
        Vehicle c = new Volvo240();
        c.startEngine();
        assertEquals(0.1, c.getCurrentSpeed(), 0.0);
    }

    @Test
    public void testGas(){
        Vehicle c = new Volvo240();
        double initialSpeed = c.getCurrentSpeed();
        assertThrows(IllegalArgumentException.class, () -> {
            c.gas(2);
        });
        assertTrue(c.getCurrentSpeed() >= initialSpeed);
    }

    @Test
    public void testBrake(){
        Vehicle c = new Volvo240();
        double initialSpeed = c.getCurrentSpeed();
        assertThrows(IllegalArgumentException.class, () -> {
            c.brake(2);
        });
        assertTrue(c.getCurrentSpeed() <= initialSpeed);
    }

    @Test
    public void testCurrentSpeed() {
        Vehicle c = new Volvo240();
        c.getCurrentSpeed();
        for (int i = 0; i < 100; i++) {
            c.gas(1);
            assertTrue(0 <= c.getCurrentSpeed() && c.getCurrentSpeed() <= c.getEnginePower());
        }
    }

    @Test
    public void testEngineAngleWhenAngleEqualsZero() {
        Scania truck = new Scania();
        for (int i = 0; i < 71; i++) {
            if (i == 0) {
                truck.setAngle(i);
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
    public void testGarage() {
        Garage<Vehicle> g = new Garage<>();
        g.loadVehicle(new Scania());
    }

}