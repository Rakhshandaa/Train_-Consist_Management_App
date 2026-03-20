import java.util.LinkedHashSet;
import java.util.Set;

public class Train_Consist_Management_App {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Create LinkedHashSet for train formation
        Set<String> train = new LinkedHashSet<>();

        // Add bogies
        train.add("Engine");
        train.add("Sleeper");
        train.add("Cargo");
        train.add("Guard");

        // Add duplicate bogie
        train.add("Sleeper"); // duplicate (ignored)

        // Display final formation
        System.out.println("\nTrain Formation (Insertion Order Preserved):");
        System.out.println(train);
    }
}