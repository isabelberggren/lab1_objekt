import org.junit.Test;

import java.awt.*;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

public class TestCars {

    @Test
    public void testColor(){
        Cars c = new Saab95();
        c.setColor(Color.BLUE);
        assertTrue(c.getColor() == Color.BLUE) ;
    }

    @Test
    public void testStartEngine(){
        Cars c = new Volvo240();
        c.startEngine();
        assertTrue(0.1 == c.getCurrentSpeed()) ;
    }

    @Test
    public void testGas(){
        Cars c = new Volvo240();
        double initialSpeed = c.getCurrentSpeed();
        c.gas(2);
        assertTrue(c.getCurrentSpeed() >= initialSpeed);
    }

    @Test
    public void testBrake(){
        Cars c = new Volvo240();
        double initialSpeed = c.getCurrentSpeed();
        c.brake(2);
        assertTrue(c.getCurrentSpeed() <= initialSpeed);
    }

    @Test
    public void testCurrentSpeed(){
        Cars c = new Volvo240();
        c.getCurrentSpeed();
        assertTrue(0 <= c.getCurrentSpeed() && c.getCurrentSpeed() <= c.getEnginePower());
    }



}
