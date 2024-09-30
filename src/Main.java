import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Create a Scanner object to read input
        Scanner in = new Scanner(System.in);
        // Display menu for the user to choose their party affiliation
        System.out.println("Please enter your party affiliation:");
        System.out.println("D - Democrat");
        System.out.println("R - Republican");
        System.out.println("I - Independent");
        System.out.print("Enter your choice: ");
        // Step 3: Get user input
        String userChoice = in.nextLine();
        // Step 4: Cascaded if-else structure to check the input and give a response
        if (userChoice.equals("D")) {
            // User chose Democrat
            System.out.println("You get a Democratic Donkey.");
        } else if (userChoice.equals("R")) {
            // User chose Republican
            System.out.println("You get a Republican Elephant.");
        } else if (userChoice.equals("I")) {
            // User chose Independent
            System.out.println("You get an Independent Person.");
        } else {
            // Any other choice is considered "Other"
            System.out.println("You get Other.");
        }
    }
}