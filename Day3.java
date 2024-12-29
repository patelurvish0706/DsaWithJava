package DsaWithJava;

import java.util.Scanner;

public class Day3 {
    
    public static void $(String tname){
        System.out.println("\n--- "+ tname+ " ---");
    }

    public static void main(String[] args) {
        // --- Loops ---
        $("Loops");
            String loops = "For loop , While loop , Do...While loop ";
            System.out.println(loops);

        // --- For loops ---
        $("For loop");
            /*
             * When we have to repeat a statement multiple times
             * you should prefer For loop.
             * for( Initialisation ; Condition ; Updation ){}
             */

            /*
             * Take Input n and print statement n times.
            */
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter Number to print number that times: ");
            int n = sc.nextInt();
            
            for(int i = 1; i <=n ; i++ ){
                System.out.println("Hello " + i );
            }

        // --- While Loop --- 
        $("While loop");
            /* Can do all works of For loop in while loop too. 
             * while(condition){ // do something }
             */

            System.out.print("Enter value of n for while loop: ");
            n = sc.nextInt();

            int i = 1;
            while(i <= n){
                System.out.println("Hello "+i);
                i++;
            }

        // --- Do While ---
        $("Do while");
            /* Do while use for execute statement once before checking while.
             * do{}while()
            */

            System.out.print("Enter value of n for check do while loop: ");
            n = sc.nextInt();
            i = 0;

            do{
                System.out.println("Hello " + i);
                i++;
            }while(i <= n);



            sc.close();
        }
}
