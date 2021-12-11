package testing;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;
import java.util.Map;



import org.junit.jupiter.api.Test;

class toptwentytest {

	@Test
	void test() {
		 Map<String, Integer> words = new HashMap<String, Integer>();
		 words.put("a", 15);
		 words.put("no", 7);
		 words.put("or", 7);
		 words.put("soul", 7);
		 
		 Map<String, Integer> expected = new HashMap<String, Integer>();
		 expected.put("a", 15);
		 expected.put("no", 7);
		 expected.put("or", 7);
		 expected.put("soul", 7);
		 
		 assertEquals(words,expected);
		 
		

		 

		
	/*	JUnitTesting t new JUnitTesting();
	   boolean output = t.getMaxTwenty("hello", 5);
	    assertEquals("This is correct", output);
	    */
	}

}
