import java.util.*;
import java.util.stream.Collectors;

class Bogie {
    String name;
    int capacity;

    Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    void display() {
        System.out.println(name + " - Capacity: " + capacity);
    }
}

public class Train_Consist_Management_App {
    public static void main(String[] args) {

        // Original list
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("Sleeper", 70));
        bogies.add(new Bogie("First Class", 24));
        bogies.add(new Bogie("AC Chair", 60));

        // UC9: Group by bogie type
        Map<String, List<Bogie>> groupedBogies = bogies.stream()
                .collect(Collectors.groupingBy(b -> b.name));

        // Display grouped result
        System.out.println("Grouped Bogies by Type:");

        for (String type : groupedBogies.keySet()) {
            System.out.println("\n" + type + ":");
            for (Bogie b : groupedBogies.get(type)) {
                b.display();
            }
        }
    }
}