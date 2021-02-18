// imports
import java.util.Scanner;
import java.util.Calendar;
/**
 * Program that determines a users age
 * @author Alex-Simko 
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */

  public static void main(String[] args) {
    // Creating a Scanner used to take user input
    Scanner input = new Scanner(System.in);

    // intilizing name variable
    String usersName;

    // Uses  Java Calendar package to get the year, futures proofs program past 2021
    // Declaring year variable
    final int CURRENT_YEAR = Calendar.getInstance().get(Calendar.YEAR);
    
    // Ask users their name
    System.out.println("Please enter your name:");

    // Runs scanner to catch next input
    usersName = input.nextLine();

    // Prints out text for user to interact
    System.out.println("Hello " + usersName);

    System.out.println("Please enter the year you were born in:");

    // gets birth year
    int userBithYear = input.nextInt();

    // calculates user age
    int usersAge = CURRENT_YEAR - userBithYear;

    // Final print 
    System.out.println("Hey " + usersName + ", I bet you are " + usersAge + " years old.");

    // Fixes resource leak, and closes scanner
    input.close();
  }

}
