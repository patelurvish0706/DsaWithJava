package DsaWithJava;

import java.util.*;

public class Day1 {

    public static void $(String topic) {
        System.out.println("\n--- " + topic + " ---");
    }

    public static void main(String[] args) {
        // --- Hello world !!! ---
        $("Hello world");

        System.out.println("Hello Java!!!");

        // --- Variables ---
        $("Variables");
        /*
         * To assign Variable
         * Syntax need to follow as:
         * Datatype varName = VariableValue;
         */

        int number = 1234;
        String alphabet = "abc@d";
        double dotNumeric = 2.50;
        boolean anyCondition = true;

        System.out.println(number + " " + alphabet + " " + dotNumeric + " " + anyCondition);

        // --- Constant Varible ---
        $("Constant Varible");
        /*
         * To make a constant variable
         * have to add final keyword in variable assign,
         * final dataType varName = VarValue;
         */

        final double pi = 3.14;

        System.out.println("Constant : " + pi);

        // --- Data Types ---
        $("Data Types");
        /* Two types of DataTypes */
        String type1 = "Primitive : byte , short , char , boolean , int , long , float , double ...";
        String type2 = "Non-Primitive : string , array , class , object , interface ...";

        System.out.println(type1 + "\n" + type2);

        // --- Operation with Variables ---
        $("Operation with Variables");

        /* In String */
        String word1 = "hello";
        String word2 = "World!";

        System.out.println("Word1 : " + word1 + "\n" + "Word2 : " + word2 + "\nConcated : " + (word1 + word2));

        String sentence = "Dsa With Java";
        System.out.println("Sentence in Variable : " + sentence);

        /* In Integer */
        System.out.println("\n--Java does not follow BODMAS in Maths operations.--");
        System.out.println("In java, *,/,% has more priority than +,- ");

        // --- Input from User ---
        $("Input from User");
        /*
         * It is important to add
         * import java.util.*;
         * to enable feature to take input.
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Type something: ");
        String userInput = sc.nextLine();

        /* next() -> Default, for String and Single character before space.
         * nextLine() -> for String and Sentence with space, Integer , Double also.
         * nextInt() -> Only for Integer, does NOT support Double.
         * nextDouble() -> Only for Double.
         * nextBoolean() -> Only for True and False. 
         */

        System.out.println("Your Input is : " + userInput);
        sc.close();
    }
}
