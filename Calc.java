import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class Calc {
    
    public int sum(int num1, int num2) {
        int result = num1 + num2;
        return result;
    }

    @Test
    void testSum() {
        int result = sum(5, 7);
        assertEquals(12, result);
    }
}
