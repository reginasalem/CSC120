import java.util.Scanner;

public class drivingUpI95 {
    static Scanner keyboard = new Scanner (System.in);

    public static void main(String[] args) {

        welcomeMessage();
        instructionsForUse();

        double distance = distance();
        double time = time();
        double speed = computeSpeed(distance, time);

        displaySpeed(speed);
        displaySpeedingTrueOrFalse(speed);

    }

    public static void welcomeMessage(){
        System.out.println("Welcome to the I95 Speed Machine");
    }
    public static void instructionsForUse(){
        System.out.println("\nYou will have to supply:\n+ The distance you want to travel, in miles\n+ The time you have available, in hours");
    }

    public static double distance(){
        System.out.print("\nEnter distance to travel: ");
        return keyboard.nextDouble();
    }

    public static double time(){
        System.out.print("Enter time available: ");
        return keyboard.nextDouble();
    }

    public static double computeSpeed(double distance, double time){

        double stopTime;
        double timeQuotient = Math.ceil(distance / 100);
        stopTime = (timeQuotient * 5/60.0);

       double computeTimeForTravel = time - stopTime;

       return distance/computeTimeForTravel;
    }

    public static void displaySpeed(double travelSpeed){
        System.out.println("\nYou will have to travel at " + Double.toString(travelSpeed) + " mph.");
    }
    public static void displaySpeedingTrueOrFalse(double travelSpd){
        if (travelSpd > 65){
            System.out.println("Over the speed limit: true");
        }
        else{
            System.out.println("Over the speed limit: false");
        }
    }
    public static void displayOutput(double computeSpeed){
        displaySpeed(computeSpeed);
        displaySpeedingTrueOrFalse(computeSpeed);
    }
}