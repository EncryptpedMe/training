package J;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestJunit {
	int a;
	String name;
	String naam;
	
   @Before
   public void setUp() {
	   a=10;
	   name = new String ("Sajal gupta");
	   naam = "Sajal gupta";
   }
   
   @Test
   public void testrun() {
	   assertEquals(10,a);
	   assertEquals("Sajal gupta",name);
	   assertNotNull(naam);
	   //assertSame(name, naam);
	   
   }
}