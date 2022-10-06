import java.util.Scanner;

public class taxTimeWithKingGeoff {
    static Scanner keyboard = new Scanner(System.in);
    private static final double STINKING_RICH = 500000;
    private static final double QUITE_RICH = 200000;
    private static final double MIAMI_POOR = 100000;
    private static final double AVERAGE = 50000;
    private static final double REALISTIC = 20000;
    private static final double TAX_STINKING_QUITE = 0.25;
    private static final double TAX_MIAMI_POOR = 0.10;
    private static final double TAX_AVERAGE_REALISTIC = 0.03;

    public static void main(String[] args) {
        double incomeDeduction[] = new double[2];
        taxAmount(incomeDeduction);
        double income=incomeDeduction[0];
        double deduction=incomeDeduction[1];
        double taxableIncome=computeTaxableIncome(income,deduction);
        String taxGroup=computeTaxGroup(taxableIncome);

        System.out.println("\nIncome = $"+income);
        System.out.println("Deduction = $"+deduction);
        System.out.println("Taxable income = $"+taxableIncome);
        System.out.println("Tax group = "+taxGroup);
        System.out.println("Tax owed = $"+computeTax(taxGroup,taxableIncome));
    }

    public static double taxAmount(double arr[]) {
        Scanner sc = new Scanner(System.in);
        String str;
        double amount;
        while (true) {
                System.out.print("Enter next amount: ");
                str = sc.nextLine();
                amount = Double.parseDouble(str);
                if (amount == 0)
                    break;
                if (amount > 0)
                    arr[0] = arr[0] + amount;
                if (amount < 0)
                    arr[1] = arr[1] + (-1 * amount);
                if (false) {
                    System.out.println("Invalid input!");
                }
        }
        return amount;
    }

    public static double computeTaxableIncome(double income,double deduction) {
        if(income >= deduction)
            return income-deduction;
        return 0.0;
    }

    public static String computeTaxGroup(double taxable) {
        if (taxable >= STINKING_RICH)
            return "S";
        if (taxable >= QUITE_RICH)
            return "Q";
        if (taxable >= MIAMI_POOR)
            return "M";
        if (taxable >= AVERAGE)
            return "A";
        if (taxable >= REALISTIC)
            return "R";
        return "P";
    }

    public static double computeTax(String taxGroup,double taxable) {
        if (taxGroup.equals("S") || taxGroup.equals("Q"))
            return taxable * TAX_STINKING_QUITE;
        if (taxGroup.equals("M"))
            return taxable * TAX_MIAMI_POOR;
        if (taxGroup.equals("A") || taxGroup.equals("R"))
            return taxable * TAX_AVERAGE_REALISTIC;
        if (taxGroup.equals("P"))
            return 0;
        return -1;
    }

}