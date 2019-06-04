package J;

import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;
import junit.framework.TestResult;

public class testCaseClass extends TestCase{
	
	@Before
	public void setUp() {
		
	}
	
	@Test
	public void testing() {
		System.out.println("Count of testcasses: "+this.countTestCases());
		System.out.println("NAme of this test case: "+this.getName());
		System.out.println("Setting my name to this test case....");this.setName("Kya kar raha hai be");
		System.out.println("New Name of this testcase: "+this.getName());
		
	}

}
