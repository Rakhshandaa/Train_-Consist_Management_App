public class Train_Consist_Management_App {
    public static void main(String[] args) {

        int[] capacities = {72, 56, 24, 70, 60};

        int n = capacities.length;

        // Bubble Sort
        for (int i = 0; i < n - 1; i++) {

            boolean swapped = false;

            for (int j = 0; j < n - i - 1; j++) {

                if (capacities[j] > capacities[j + 1]) {

                    // swap
                    int temp = capacities[j];
                    capacities[j] = capacities[j + 1];
                    capacities[j + 1] = temp;

                    swapped = true;
                }
            }

            // Optimization: stop if already sorted
            if (!swapped) break;
        }

        // Display result
        System.out.println("Sorted Capacities:");
        for (int c : capacities) {
            System.out.print(c + " ");
        }
    }
}