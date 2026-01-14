package code_coverage_4.code_coverage_4;
import static org.junit.Assert.*;
import org.junit.Test;

public class TestFunc2 {
	
	@Test	

	 public void test_pNotZero() {
		
	        String result = CoverageFunctions.func2(2,10);
	        assertEquals("p=12.00, q=0.83", result);
		}
	
	@Test 
	
	public void test_pZero() {
		
        String result = CoverageFunctions.func2(0,5);
        assertEquals("p=0.00, q=Infinity", result);
	}



}
