import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

public class UseCase8TrainConsistMngmtTest {

    @Test
    void testFilter_CapacityGreaterThanThreshold() {
        List<Bogie> list = List.of(
                new Bogie("Sleeper", 72),
                new Bogie("AC Chair", 56)
        );

        List<Bogie> result = Train_Consist_Management_App.filterBogies(list);

        assertEquals(1, result.size());
    }

    @Test
    void testFilter_CapacityEqualToThreshold() {
        List<Bogie> list = List.of(
                new Bogie("Test", 60)
        );

        List<Bogie> result = Train_Consist_Management_App.filterBogies(list);

        assertTrue(result.isEmpty());
    }

    @Test
    void testFilter_CapacityLessThanThreshold() {
        List<Bogie> list = List.of(
                new Bogie("Test", 40)
        );

        List<Bogie> result = Train_Consist_Management_App.filterBogies(list);

        assertTrue(result.isEmpty());
    }

    @Test
    void testFilter_MultipleBogiesMatching() {
        List<Bogie> list = List.of(
                new Bogie("Sleeper", 72),
                new Bogie("Luxury", 80)
        );

        List<Bogie> result = Train_Consist_Management_App.filterBogies(list);

        assertEquals(2, result.size());
    }

    @Test
    void testFilter_NoBogiesMatching() {
        List<Bogie> list = List.of(
                new Bogie("AC Chair", 50),
                new Bogie("General", 40)
        );

        List<Bogie> result = Train_Consist_Management_App.filterBogies(list);

        assertTrue(result.isEmpty());
    }

    @Test
    void testFilter_AllBogiesMatching() {
        List<Bogie> list = List.of(
                new Bogie("Sleeper", 70),
                new Bogie("Luxury", 75)
        );

        List<Bogie> result = Train_Consist_Management_App.filterBogies(list);

        assertEquals(list.size(), result.size());
    }

    @Test
    void testFilter_EmptyBogieList() {
        List<Bogie> list = new ArrayList<>();

        List<Bogie> result = Train_Consist_Management_App.filterBogies(list);

        assertTrue(result.isEmpty());
    }

    @Test
    void testFilter_OriginalListUnchanged() {
        List<Bogie> list = new ArrayList<>();
        list.add(new Bogie("Sleeper", 72));

        Train_Consist_Management_App.filterBogies(list);

        assertEquals(1, list.size());
    }
}