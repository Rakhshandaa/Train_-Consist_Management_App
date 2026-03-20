import java.util.ArrayList;
import java.util.List;

public class Train_Consist_Management_App {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Create ArrayList for passenger bogies
        List<String> passengerBogies = new ArrayList<>();

        // Add bogies
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        // Display bogies
        System.out.println("\nPassenger Bogies after addition:");
        System.out.println(passengerBogies);

        // Remove one bogie
        passengerBogies.remove("AC Chair");
        System.out.println("\nAfter removing AC Chair:");
        System.out.println(passengerBogies);

        // Check existence
        if (passengerBogies.contains("Sleeper")) {
            System.out.println("\nSleeper bogie exists in the train.");
        } else {
            System.out.println("\nSleeper bogie not found.");
        }

        // Final list
        System.out.println("\nFinal Passenger Bogies:");
        System.out.println(passengerBogies);
    }
}