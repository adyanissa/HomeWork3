package code_coverage_4.code_coverage_4;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import org.junit.Test;

public class WeakmethodTest {


    @Test
    public void testStatementCoverage() {
        WeakClass wc = new WeakClass();
        int result = wc.weakMethod(5);   // x>0 => x=10 => 10/10=1
        assertEquals(1, result);
    }

    @Test
    public void testBranchFalseNegativeX() {
        WeakClass wc = new WeakClass();
        int result = wc.weakMethod(-5);  // x>0 false => 10/(-5)=-2
        assertEquals(-2, result);
    }

    @Test
    public void testBranchCoverage() {
        WeakClass wc = new WeakClass();
        assertThrows(ArithmeticException.class, () -> {
            wc.weakMethod(0);   // 10 / 0 → ArithmeticException
        });
    }
}


