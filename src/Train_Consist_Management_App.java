import java.util.Arrays;

public class Train_Consist_Management_App {
    public static void main(String[] args) {

        String[] bogieNames = {
                "Sleeper",
                "AC Chair",
                "First Class",
                "General",
                "Luxury"
        };

        // Sorting using built-in method
        Arrays.sort(bogieNames);

        // Display result
        System.out.println("Sorted Bogie Names:");
        System.out.println(Arrays.toString(bogieNames));
    }
}