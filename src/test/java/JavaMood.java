
import static org.junit.Assert.*;
import org.assertj.core.api.Assertions;
import org.junit.Test;

import JavaDay21.MoodAnalyzer;

public class JavaMood {
	    @Test
	    public void testMood_MoodIsSad() {
	    	MoodAnalyzer ma = new MoodAnalyzer("I am in sad mood");
	        String mood = ma.analyMood();
	        assertEquals(mood,"SAD");
	    }
	    @Test
	    public void testMood_MoodIsHappy() {
	    	MoodAnalyzer ma = new MoodAnalyzer("I am in any mood");
	        String mood1 = ma.analyMood();
	        assertEquals(mood1,"HAPPY");
	    }

      @Test
      public void Null() {
    	  MoodAnalyzer ma = new MoodAnalyzer(null);
      String mood2 = ma.analyMood();
    assertEquals(mood2,"HAPPY");

}
}