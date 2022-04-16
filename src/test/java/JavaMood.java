//import static org.junit.Assert.*;

import org.junit.Test;

import JavaDay21.MoodAnalyzer;
//import JavaDay21.MoodAnalyzer.Mood_analyser_Main;
import static org.junit.Assert.*;
public class JavaMood {

	@Test
	
	public void testMood_MoodIsSad() {
		MoodAnalyzer ma = new MoodAnalyzer();
        String mood = ma.analyseMood("I am in sad mood");
        assertEquals(mood,"SAD");
    }

    @Test
    public void testMood_MoodIsHappy() {
    	MoodAnalyzer ma = new MoodAnalyzer();
        String mood1 = ma.analyseMood("I am in any mood");
        assertEquals(mood1,"HAPPY");    
}
}

