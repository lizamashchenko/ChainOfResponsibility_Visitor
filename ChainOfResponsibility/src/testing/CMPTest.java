package testing;
import main.*;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

public class CMPTest {

    @Test
    public void testSolve() {
        List<Integer> coins = Arrays.asList(1, 2, 5, 10, 20, 50);
        CMP cmp = new CMP(178, coins);
        Map<Integer, Integer> result = cmp.solve();

        assertEquals(178, cmp.getTargetSum());

        assertEquals(3, result.get(50).intValue());
        assertEquals(1, result.get(20).intValue());
        assertEquals(1, result.get(5).intValue());
        assertEquals(1, result.get(2).intValue());
        assertEquals(1, result.get(1).intValue());
    }

    @Test
    public void testSolveWithZeroTargetSum() {
        List<Integer> coins = Arrays.asList(1, 2, 5, 10, 20, 50);
        CMP cmp = new CMP(0, coins);
        Map<Integer, Integer> result = cmp.solve();

        assertEquals(0, cmp.getTargetSum());
        assertEquals(0, result.size()); // No coins should be selected
    }
}
