package code_coverage_4.code_coverage_4;
import static org.junit.Assert.*;
import org.junit.Test;

public class Func3Test {
	@Test 
	
	public void test_xPositive() {
		
		 assertThrows(ArithmeticException.class, () -> {
			 CoverageFunctions.func3(1);
			 });
	}
	public void test_xZero() {
		
		 assertThrows(ArithmeticException.class, () -> {
			 CoverageFunctions.func3(0);
			 });
	}
}
