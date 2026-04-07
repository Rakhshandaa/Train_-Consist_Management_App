import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UseCase11TrainConsistMngmtTest {

    @Test
    void testRegex_ValidTrainID() {
        assertTrue(Train_Consist_Management_App.isValidTrainID("TRN-1234"));
    }

    @Test
    void testRegex_InvalidTrainIDFormat() {
        assertFalse(Train_Consist_Management_App.isValidTrainID("TRAIN12"));
        assertFalse(Train_Consist_Management_App.isValidTrainID("TRN12A"));
        assertFalse(Train_Consist_Management_App.isValidTrainID("1234-TRN"));
    }

    @Test
    void testRegex_ValidCargoCode() {
        assertTrue(Train_Consist_Management_App.isValidCargoCode("PET-AB"));
    }

    @Test
    void testRegex_InvalidCargoCodeFormat() {
        assertFalse(Train_Consist_Management_App.isValidCargoCode("PET-ab"));
        assertFalse(Train_Consist_Management_App.isValidCargoCode("PET123"));
        assertFalse(Train_Consist_Management_App.isValidCargoCode("AB-PET"));
    }

    @Test
    void testRegex_TrainIDDigitLengthValidation() {
        assertFalse(Train_Consist_Management_App.isValidTrainID("TRN-123"));
        assertFalse(Train_Consist_Management_App.isValidTrainID("TRN-12345"));
    }

    @Test
    void testRegex_CargoCodeUppercaseValidation() {
        assertFalse(Train_Consist_Management_App.isValidCargoCode("PET-ab"));
    }

    @Test
    void testRegex_EmptyInputHandling() {
        assertFalse(Train_Consist_Management_App.isValidTrainID(""));
        assertFalse(Train_Consist_Management_App.isValidCargoCode(""));
    }

    @Test
    void testRegex_ExactPatternMatch() {
        assertFalse(Train_Consist_Management_App.isValidTrainID("TRN-1234X"));
        assertFalse(Train_Consist_Management_App.isValidCargoCode("PET-ABC"));
    }
}