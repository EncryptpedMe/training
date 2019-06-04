package J;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class MainTestRunner {

	public static void main(String[] args) {
		Result runner = JUnitCore.runClasses(Test1.class,Test2.class);
		
		for(Failure f : runner.getFailures())
			System.out.println(f.toString());
		System.out.println(runner.wasSuccessful());
	}

}
