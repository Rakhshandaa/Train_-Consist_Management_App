import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

public class UseCase13TrainConsistMngmtTest {

    @Test
    void testLoopFilteringLogic() {
        List<Bogie> list = List.of(
                new Bogie("A", 70),
                new Bogie("B", 50)
        );

        List<Bogie> result = Train_Consist_Management_App.filterLoop(list);

        assertEquals(1, result.size());
    }

    @Test
    void testStreamFilteringLogic() {
        List<Bogie> list = List.of(
                new Bogie("A", 70),
                new Bogie("B", 50)
        );

        List<Bogie> result = Train_Consist_Management_App.filterStream(list);

        assertEquals(1, result.size());
    }

    @Test
    void testLoopAndStreamResultsMatch() {
        List<Bogie> list = List.of(
                new Bogie("A", 70),
                new Bogie("B", 50),
                new Bogie("C", 80)
        );

        List<Bogie> loopResult = Train_Consist_Management_App.filterLoop(list);
        List<Bogie> streamResult = Train_Consist_Management_App.filterStream(list);

        assertEquals(loopResult.size(), streamResult.size());
    }

    @Test
    void testExecutionTimeMeasurement() {
        List<Bogie> list = new ArrayList<>();

        for (int i = 0; i < 1000; i++) {
            list.add(new Bogie("B" + i, i));
        }

        long start = System.nanoTime();
        Train_Consist_Management_App.filterStream(list);
        long end = System.nanoTime();

        long time = end - start;

        assertTrue(time > 0);
    }

    @Test
    void testLargeDatasetProcessing() {
        List<Bogie> list = new ArrayList<>();

        for (int i = 0; i < 10000; i++) {
            list.add(new Bogie("B" + i, i));
        }

        List<Bogie> result = Train_Consist_Management_App.filterStream(list);

        assertNotNull(result);
    }
}