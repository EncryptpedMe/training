package J;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import javax.transaction.Synchronization;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class MainPrimeParameterisedJUnitTest {
	private Integer number;
	private boolean result;
	private PrimeNumberClass pnc; 
	
	
	@Before
	public void initialize() {
		pnc = new PrimeNumberClass();
	}

	public MainPrimeParameterisedJUnitTest(int num,boolean Expectedresult) {
		this.number = num;
		this.result=Expectedresult;
	}
	@Parameterized.Parameters
	   public static Collection primeNumbers() {
	      return Arrays.asList(new Object[][] {
	         { 2, true },
	         { 6, false},
	         { 19, true },
	         { 22, false },
	         { 23, true }
	      });
	}
	 @Test
	 public synchronized void TestPrimeNumber() {
		 System.out.println("PAramerterized Number: " + number);
		 assertEquals(result,pnc.validate(number));
	 }
}
