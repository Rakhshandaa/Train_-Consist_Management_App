import java.util.*;

public class Train_Consist_Management_App {
    public static void main(String[] args) {

        List<String> bogies = new ArrayList<>();
        // bogies.add("BG101"); // try with and without data

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Bogie ID to search: ");
        String key = sc.nextLine();

        try {
            // Defensive check
            if (bogies.isEmpty()) {
                throw new IllegalStateException("No bogies available in the train to search.");
            }

            boolean found = false;

            // Linear Search
            for (String id : bogies) {
                if (id.equals(key)) {
                    found = true;
                    break;
                }
            }

            if (found) {
                System.out.println("Bogie ID FOUND");
            } else {
                System.out.println("Bogie ID NOT FOUND");
            }

        } catch (IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}