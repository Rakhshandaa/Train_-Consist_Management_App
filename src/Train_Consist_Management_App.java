import java.util.Scanner;

public class Train_Consist_Management_App {
    public static void main(String[] args) {

        String[] bogieIDs = {"BG101", "BG205", "BG309", "BG412", "BG550"};

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Bogie ID to search: ");
        String key = sc.nextLine();

        boolean found = false;

        // Linear Search
        for (int i = 0; i < bogieIDs.length; i++) {
            if (bogieIDs[i].equals(key)) {
                found = true;
                break; // early termination
            }
        }

        // Output
        if (found) {
            System.out.println("Bogie ID FOUND");
        } else {
            System.out.println("Bogie ID NOT FOUND");
        }

        sc.close();
    }
}