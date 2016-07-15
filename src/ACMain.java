import java.util.HashMap;
import java.util.Scanner;

public class ACMain {
    public static void main(String[] args){

        // A little setup
        Scanner mainScanner = new Scanner(System.in);
        ApplicationController myLittleACP = new ApplicationController();

        // Series of commands to make sure it knows how to handle different hashmaps of commands
        // Is this the right method to send it?
        // Is it actually mapping this stuff?
        // I'm nervous about this part.
        myLittleACP.mapCommand("books", new BookHandler()); // Should the commands be pluralized?
        myLittleACP.mapCommand("movies", new MovieHandler());

        // Try/catch for user interaction
//        try {
            // Some bland message
            System.out.println("This crappy little app will help you calculate the price of purchasing a few things.");
            System.out.println("You can purchase books or movies.");

            // Getting user input as a string - selecting books or movies
            System.out.println("Which one do you want? ");
            String command = mainScanner.nextLine();
            command = command.toLowerCase();

            // Getting user input again, but this time retrieving how many of that item they want
            System.out.print("How many do you want? ");
            int amount = mainScanner.nextInt();
            HashMap data = new HashMap();
            data.put("amount", amount);
            data.put("bookPrice", 5.0);
            data.put("moviePrice", 10.0);

            myLittleACP.handleRequest(command, data);

//        } catch (Exception e) {
//            System.out.println("Enter a valid type of product to purchase. ");
//        }
    }
}
