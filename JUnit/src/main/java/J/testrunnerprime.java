package J;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class testrunnerprime {

	public static void main(String[] args) {
		Result runner = JUnitCore.runClasses(MainPrimeParameterisedJUnitTest.class);
		for(Failure f : runner.getFailures())
			System.out.println(f.getMessage());
		System.out.println(runner.wasSuccessful());

	}

}
