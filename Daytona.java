import java.util.Scanner;
import java.util.Arrays;


public class Daytona {
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    // Variables
    int choice = 0;
    int time = 24;

    while (choice != 4) {
      // Menu
      System.out.println("\nWelcome to Daytona Beach!");
      System.out.println("What would you like to do?");
      System.out.println("1. Drive on the Beach");
      System.out.println("2. Play Disc Golf");
      System.out.println("3. See the race.");
      System.out.println("4. Exit\n");
      choice = scan.nextInt();

      // 1. rive on the beach
      if (choice == 1) {
        System.out.println("\nWhat time did Knightro get to the beach?");
        time = scan.nextInt();
        if (time >= 9 && time <= 18) {
          System.out.println("\nEnjoy your drive!");
        } else {
          System.out.println("\nOh no! The beach is closed. ");
        }
      }

      // 2. Play Disc Golf
      if (choice == 2) {

        int meters = 313;
        int disc = 0;
        int sum = 0;

        System.out.println("\nWelcome to the park!");
        System.out.println("There is 313 feet left until the basket.");
        System.out.println("How far did you throw?");
        disc = scan.nextInt();
        sum = disc;

        // Adding input until the sum equals basket distance
        do {

          int Remainder = meters - sum;

          System.out.println("\nThere is " + Remainder + " feet left until the basket.");
          System.out.println("How far did you throw?");
          disc = scan.nextInt();

          sum = sum + disc;
          disc++;

        } while (sum < meters);

        // User wins the game
        if (sum == meters) {
          System.out.println("\n\tYou made it in!");
        }
        // User goes to far - Reset game

        if (sum > meters) {
          System.out.println("\n\tYou went to far, Try Again");
        }

      }

      // 3. See the race

      if (choice == 3) {
        System.out.println("\nHow many laps are left?");
        int lapsLeft = scan.nextInt();
        int[] laps ;
        laps = new int[lapsLeft];

        
        for (int i = 0; i < laps.length; i++) {
          
          laps[i]= i;
         
        }

        for (int j= laps.length ; j > 0; j--) {
          System.out.println("there are " + j +" laps left");
        }
        
        System.out.println("\nFinished!");

      }

      // 4. Exit

      if (choice == 4) {
        System.out.println("\n\tGoodbye!!!");
      }

    }

    scan.close();
  }

}
