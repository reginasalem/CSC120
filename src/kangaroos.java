import java.util.Scanner;
//=========================================
public class kangaroos {
    private static Scanner keyboard= new Scanner(System.in);
    public static void main(String[] args) {
        //Declaration of variables
        double lenSideSquare;
        double lenRoad;
        double numKangaroos;
        double kanDensity;
        double roadSurface;
        double numKills;

        //Input of user
        System.out.print("Enter side of square in km: ");
        lenSideSquare = keyboard.nextDouble();

        System.out.print("Enter road length in km: ");
        lenRoad = keyboard.nextDouble();

        System.out.print("Enter number of kangaroos: ");
        numKangaroos = keyboard.nextDouble();

        //Calculations
        kanDensity = (numKangaroos/(lenSideSquare*lenSideSquare));
        roadSurface = (lenRoad * 0.01);
        numKills = (kanDensity * roadSurface * 1.47);

        //Final answer
        System.out.println("Expected number of kills: " + numKills);
    }
}
//=========================================