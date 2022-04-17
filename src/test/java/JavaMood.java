
import static org.junit.Assert.*;
import org.assertj.core.api.Assertions;
import org.junit.Test;

import JavaDay21.MoodAnalyzer;

public class JavaMood {
	    @Test
	    public void sadMood() {
	    	MoodAnalyzer sc = new MoodAnalyzer("Output is a sad ");
	        String mood = sc.analyMood();
	        assertEquals(mood,"SAD");
	    }
	    @Test
	    public void happyMood() {
	    	MoodAnalyzer sc = new MoodAnalyzer("OutPut is a happy ");
	        String mood = sc.analyMood();
	        assertEquals(mood,"HAPPY");
	    }

      @Test
      public void Null() {
    	  MoodAnalyzer sc = new MoodAnalyzer(null);
      String mood3 = sc.analyMood();
    assertEquals(mood3,"HAPPY");

}
}