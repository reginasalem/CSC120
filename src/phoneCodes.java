import java.util.Scanner;

public class phoneCodes {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        long s = 0;

        do {

            System.out.print("Please enter your 305 phone number: ");

            s = sc.nextLong();
        }
        while(!(String.valueOf(s).length()==7));


        s = s + (long)305 * 10000000;

        String e = encode(s);

        System.out.println("The phone number "+ s +" can be encoded as "+ e);

    }
     private static String encode(long s) {

        String encoded_form = "";


        char[] arr1 = new char[]{'0','1','A','D','G','J','M','P','T','W'};

        int[] arr2 = new int[]{1,1,3,3,3,3,3,4,3,4};


        do {

            int digit = (int)(s%10);

            s = s/10;

            int randomNum = (int)(Math.random()*arr2[digit]);

            int ascii = (int)arr1[digit] + randomNum;

            char c = (char)ascii;

            String temp = String.valueOf(c);

            encoded_form = temp + encoded_form;
        }
         while(s!=0);


        return encoded_form;
    }
}