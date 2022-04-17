
import static org.junit.Assert.*;
import org.assertj.core.api.Assertions;
import org.junit.Test;

import JavaDay21.MoodAnalyzer;
import JavaDay21.Mood_Excepation;

public class JavaMood {
	
	    @Test
	    public void sadMood(){
	    	MoodAnalyzer ma = new MoodAnalyzer("I am in Sad Mood");
	        String mood = null;
	        try {
	            mood = ma.analyMood();
	        }catch (Mood_Excepation e){
	            System.out.println(e);
		    assertEquals("SAD",mood);
	        }
	        
	    }

	    @Test
	    public void happyMood(){
	    	MoodAnalyzer ma = new MoodAnalyzer("I am in Happy Mood");
	        String mood = null;
	        try{
	            mood = ma.analyMood();
	            assertEquals("HAPPY",mood);
	        }catch (Mood_Excepation e){
	            System.out.println(e);
	        }
	    }

	    @Test
	    public void returnHappy() {
	        String mood1 = null;
	        MoodAnalyzer ma = new MoodAnalyzer(null);
	        try{
	            mood1 = ma.analyMood();
	            assertEquals("HAPPY",mood1);
	        }catch (Mood_Excepation e){
	            System.out.println(e);
	        }
	    }

	    @Test
	    public void givenEmptyMood(){
	        String mood = null;
	        MoodAnalyzer ma = new MoodAnalyzer();
	        try{
	            mood = ma.analyMood();
	            assertEquals("HAPPY",mood);
	        }catch (Mood_Excepation e){
	            System.out.println(e);
	        }
	    }
	}