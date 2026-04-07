import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

public class UseCase10TrainConsistMngmtTest {

    @Test
    void testReduce_TotalSeatCalculation() {
        List<Bogie> list = List.of(
                new Bogie("Sleeper", 72),
                new Bogie("AC Chair", 56)
        );

        int total = Train_Consist_Management_App.totalCapacity(list);

        assertEquals(128, total);
    }

    @Test
    void testReduce_MultipleBogiesAggregation() {
        List<Bogie> list = List.of(
                new Bogie("Sleeper", 70),
                new Bogie("Luxury", 80),
                new Bogie("General", 50)
        );

        int total = Train_Consist_Management_App.totalCapacity(list);

        assertEquals(200, total);
    }

    @Test
    void testReduce_SingleBogieCapacity() {
        List<Bogie> list = List.of(
                new Bogie("Sleeper", 72)
        );

        int total = Train_Consist_Management_App.totalCapacity(list);

        assertEquals(72, total);
    }

    @Test
    void testReduce_EmptyBogieList() {
        List<Bogie> list = new ArrayList<>();

        int total = Train_Consist_Management_App.totalCapacity(list);

        assertEquals(0, total);
    }

    @Test
    void testReduce_CorrectCapacityExtraction() {
        List<Bogie> list = List.of(
                new Bogie("A", 10),
                new Bogie("B", 20)
        );

        int total = Train_Consist_Management_App.totalCapacity(list);

        assertEquals(30, total);
    }

    @Test
    void testReduce_AllBogiesIncluded() {
        List<Bogie> list = List.of(
                new Bogie("A", 10),
                new Bogie("B", 20),
                new Bogie("C", 30)
        );

        int total = Train_Consist_Management_App.totalCapacity(list);

        assertEquals(60, total);
    }

    @Test
    void testReduce_OriginalListUnchanged() {
        List<Bogie> list = new ArrayList<>();
        list.add(new Bogie("Sleeper", 72));

        Train_Consist_Management_App.totalCapacity(list);

        assertEquals(1, list.size());
    }
}