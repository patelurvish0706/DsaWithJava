package DsaWithJava;

import java.util.*;

public class Day2 {

    public static void $(String topic) {
        System.out.println("\n--- " + topic + " ---");
    }

    public static void main(String[] args) {
        // --- Conditional Statements ---
        $("Conditional Statements");
        String conState = "If...else... , Else if , Switch , Break , Continue";
        System.out.println(conState);

        // --- If...Else... ---
        $("If else");
        /*
         * Simple age calculator to test aligibility for Vote.
         * if age > 18, can vote.
         * else have to wait (18 - age) year.
         */

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age to test voting eligibility: ");
        int age = sc.nextInt();

        if (age >= 18) {
            System.out.println("Yes you can vote.");
        } else {
            System.out.println("Sorry you are minor.\nhave to wait [" + (18 - age) + "] year(s) more.");
        }

        // --- Else if ----
        $("Else if");
        /*
         * When we have more that two situation to validate
         * you should use Else if.
         * * Compare three Variables by their values
         */

        System.out.println("Enter values for each Element to compare.");
        System.out.print("a = ");
        int a = sc.nextInt();
        System.out.print("b = ");
        int b = sc.nextInt();
        System.out.print("c = ");
        int c = sc.nextInt();

        if (a > b & a > c) {
            System.out.println("a " + a + " is greater.");
        } else if (b > a & b > c) {
            System.out.println("b " + b + " is greater.");
        } else {
            System.out.println("c " + c + " is greater.");
        }

        // --- Switch Case ---
        $("Switch Case");
        /*
         * Use for any accure among multiple cases.
         * performing math operation on two values.
         */

        System.out.println("Enter values and choose option to perform operation.");

        System.out.print("var1 : ");
        int value1 = sc.nextInt();

        System.out.print("var2 : ");
        int value2 = sc.nextInt();

        System.out.print("Choose operatorr( * , / , % , + or - ): ");
        String valOprt = sc.next();

        switch (valOprt) {
            case "+":
                int sum = value1 + value2;
                System.out.println(value1 + " " + valOprt + " " + value2 + " = " + sum);
                break;

            case "-":
                int min = value1 - value2;
                System.out.println(value1 + " " + valOprt + " " + value2 + " = " + min);
                break;

            case "/":
                int div = value1 / value2;
                System.out.println(value1 + " " + valOprt + " " + value2 + " = " + div);
                break;

            case "*":
                int mul = value1 * value2;
                System.out.println(value1 + " " + valOprt + " " + value2 + " = " + mul);
                break;

            case "%":
                int mod = value1 % value2;
                System.out.println(value1 + " " + valOprt + " " + value2 + " = " + mod);
                break;

            default:
                System.out.println("Invalid Operator!!");
                break;
        }

        sc.close();
    }
}
