import java.util.Scanner;

public class Train_Consist_Management_App {
    public static void main(String[] args) {

        // Sorted array (VERY IMPORTANT)
        String[] bogieIDs = {"BG101", "BG205", "BG309", "BG412", "BG550"};

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Bogie ID to search: ");
        String key = sc.nextLine();

        int low = 0, high = bogieIDs.length - 1;
        boolean found = false;

        // Binary Search
        while (low <= high) {

            int mid = (low + high) / 2;

            int result = key.compareTo(bogieIDs[mid]);

            if (result == 0) {
                found = true;
                System.out.println("Bogie ID FOUND at index: " + mid);
                break;
            }
            else if (result < 0) {
                high = mid - 1;   // search left
            }
            else {
                low = mid + 1;    // search right
            }
        }

        if (!found) {
            System.out.println("Bogie ID NOT FOUND");
        }

        sc.close();
    }
}