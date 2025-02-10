import java.awt.*;

public class carTransport extends Truck{

    public carTransport() {
        nrDoors = 2;
        color = Color.orange;
        enginePower = 1500;
        modelName = "Car transporter";
        double angle = 0;
        position = 0;
        stopEngine();
    }

    //bilar kan endast lastas om rampen är nere och befinner sig rimligt nära transporten
    


    //bilar kan endast lossas om ramoen är nere, de bör då hamna rimligt nära biltrasnporten

    //bilar kan endast lossas i omvändordning från hur de lastas

    //biltransport kan inte lasta på en annan biltrasnport.

    //samma x, y som la trasnportation car.
}
