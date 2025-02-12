public class HelpRaiseLower{

    public static void Raise(int degrees) {
        int ang = Truck.getAngle();
        int newAng = ang + degrees;
        if ( newAng > 70){
        Truck.setAngle(70);}

    Truck.setAngle(newAng);

    }

    public static void Lower(int degrees){
        int ang = Truck.getAngle();
        int newAng = ang - degrees;
        if ( newAng < 0){
            Truck.setAngle(0);}

        Truck.setAngle(newAng);}


}
