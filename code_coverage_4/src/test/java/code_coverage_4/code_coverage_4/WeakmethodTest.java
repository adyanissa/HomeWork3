package code_coverage_4.code_coverage_4;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class WeakmethodTest {

    @Test
    public void testStatementCoverage() {
        int result = WeakClass.weakMethod(5);
        assertEquals(6, result);
    }

    @Test
    public void testBranchPositive() {
        int result = WeakClass.weakMethod(5);
        assertEquals(6, result);
    }

    @Test
    public void testBranchNegative() {
        int result = WeakClass.weakMethod(-5);
        assertEquals(-4, result);
    }
}
