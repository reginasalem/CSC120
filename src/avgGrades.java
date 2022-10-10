import java.util.Scanner;

public class avgGrades {

        public static void main(String[] args) {

            Scanner in = new Scanner(System.in);

            double sum = 0;

            double input = 0;
            int count = 0;
            do {
                System.out.print("Enter grade (type -1 to calculate): ");
                input = in.nextDouble();

                if (input != -1) {
                    sum += input;
                    count += 1;
                }

            } while (input != -1);

            if (count == 0)
                System.out.println("No data entered! Program is terminated!!");
            else
                System.out.println("\nClass Average: " + (sum / count));

            in.close();
        }
    }
