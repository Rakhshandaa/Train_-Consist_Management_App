import java.util.*;

// Custom Exception
class InvalidCapacityException extends Exception {
    InvalidCapacityException(String message) {
        super(message);
    }
}

// Bogie class
class Bogie {
    String name;
    int capacity;

    // Constructor with validation
    Bogie(String name, int capacity) throws InvalidCapacityException {
        if (capacity <= 0) {
            throw new InvalidCapacityException("Capacity must be greater than zero");
        }
        this.name = name;
        this.capacity = capacity;
    }

    void display() {
        System.out.println(name + " - Capacity: " + capacity);
    }
}

public class Train_Consist_Management_App {
    public static void main(String[] args) {

        try {
            // Valid bogie
            Bogie b1 = new Bogie("Sleeper", 72);
            b1.display();

            // Invalid bogie (will throw exception)
            Bogie b2 = new Bogie("AC Chair", -10);
            b2.display();

        } catch (InvalidCapacityException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}