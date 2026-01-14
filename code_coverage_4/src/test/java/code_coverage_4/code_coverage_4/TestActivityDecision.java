package code_coverage_4.code_coverage_4;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

    public class TestActivityDecision {
    	
    	ActivityDecision a=new ActivityDecision();
	@Test 
	public void test1() {
        String result = a.decideActivity(true,true,true,true,true);
        assertEquals("Take umbrella and searchlight", result);
	}
	@Test 
	public void test2() {
        String result = a.decideActivity(true,true,false,false,false);
        assertEquals("Take searchlight", result);
	}
	@Test 
	public void test3() {
        String result = a.decideActivity(false,false,false,false,true);
        assertEquals("Keep doing what you were doing", result);
	}
	@Test 
	public void test4() {
        String result = a.decideActivity(false,false,true,true,true);
        assertEquals("Take umbrella", result);
	}
}
