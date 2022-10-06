import java.util.Scanner;
//==========================================
public class nitroxScuba {
    final static int feetPerAtmosphere = 33;
    final static double maxPressure = 1.4;
    final static double maxContingency = 1.6;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Assign variables
        int depth, o2Percentage;
        double ambientPressure, o2Pressure;
        char groupLetter;

        //Get input from user
        System.out.print("Enter depth and percentage O2: ");
        depth = scanner.nextInt();
        o2Percentage = scanner.nextInt();

        //Calculations
        ambientPressure = depth / feetPerAtmosphere + 1;
        o2Pressure = ambientPressure * o2Percentage / 100;
        groupLetter = (char) ((int) (o2Pressure*10)+'A');

        //Output
        System.out.println("\nAmbient pressure                : " + ambientPressure);
        System.out.println("O2 pressure                     : " + o2Pressure);
        System.out.println("O2 group                        : " + groupLetter);
        System.out.println("\nExceeds maximal O2 pressure     : " + (o2Pressure > maxPressure));
        System.out.println("Exceeds contingency O2 pressure : " + (o2Pressure > maxContingency));

        }
    }
//==========================================
