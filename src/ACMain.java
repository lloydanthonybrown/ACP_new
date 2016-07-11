import java.util.HashMap;
import java.util.Scanner;

public class ACMain {
    public static void main(String[] args){

        // A little setup
        Scanner mainScanner = new Scanner(System.in);
        ApplicationController myLittleACP = new ApplicationController();

        // Series of commands to make sure it knows how to handle different hashmaps of commands
        // Is this the right method to send it?
        myLittleACP.mapCommand("book", new BookHandler());
        myLittleACP.mapCommand("movie", new MovieHandler());

        // Try/catch for user interaction
        try {
            // Some bland message
            System.out.println("This crappy little app will help you calculate the price of purchasing a few things.");
            System.out.println("***********************************");
            System.out.println("You can purchase books or movies.");
            System.out.println("***********************************");
            System.out.println("Which one do you want? ");

            // Getting user input as a string - selecting books or movies
            String command = mainScanner.nextLine();
            command = command.toLowerCase();
            System.out.print("How many do you want? ");

            // Getting user input again, but this time retrieving how many of that item they want
            int amount = mainScanner.nextInt();
            HashMap data = new HashMap();
            data.put("amount", amount);
            data.put("bookPrice", 5);
            data.put("moviePrice", 10);

            myLittleACP.handleRequest(command, data);

        } catch (Exception e) {
            System.out.println("Enter a valid type of product to purchase. ");
        }
    }
}
