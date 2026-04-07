import static org.junit.jupiter.api.Assertions.*;

class Train_Consist_Management_AppTest {
    import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

    class UseCase8TrainConsistMngmtTest {

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
        void testFilter_EmptyBogieList() {
            List<Bogie> list = new ArrayList<>();

            List<Bogie> result = Train_Consist_Management_App.filterBogies(list);

            assertTrue(result.isEmpty());
        }
    }
}