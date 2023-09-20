import org.example.MainHW3;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.*;

class MainHW3test {
    private MainHW3 mainHW3;

    @BeforeEach
    void setUp() {mainHW3 = new MainHW3();}

    //HW 3.1

    @ParameterizedTest
    @ValueSource(ints = {2})
    void divisionBy2ReturnsTrue(int n) {
        assertEquals(true, mainHW3.evenOddNumber(n));
    }

    @ParameterizedTest
    @ValueSource(ints = {3})
    void divisionBy3ReturnsFalse(int n) {
        assertEquals(false, mainHW3.evenOddNumber(n));
    }

    //HW 3.2

    @Test
    void numberInInterval() {
        assertTrue(mainHW3.numberInInterval(50));
    }

    @Test
    void numberNotInInterval() {
        assertFalse(mainHW3.numberInInterval(10));
    }

}