package code_coverage_4.code_coverage_4;
import static org.junit.Assert.*;
import org.junit.Test;
import static org.junit.Assert.*;



public class Func1Test {
	@Test	
	 public void test_True() {
		
	        int result = CoverageFunctions.func1(1,0,50);
	        assertEquals(5, result);
		}
	
	@Test 
	
	public void test_xZero() {
		
		 assertThrows(ArithmeticException.class, () -> {
			 CoverageFunctions.func1(0,2,50);
			 });

	 }
}

