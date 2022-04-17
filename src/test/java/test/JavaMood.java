package test;

import static org.junit.Assert.*;

import org.junit.Test;

import JavaDay21.MoodAnalyzer;

	public class JavaMood {
		@Test
		public void testMood_MoodIsSad() {
			MoodAnalyzer ma = new MoodAnalyzer("I am in sad mood");
			String mood = ma.analyseMood();
			assertEquals(mood, "SAD");
		}

		@Test
		public void testMood_MoodIsHappy() {
			MoodAnalyzer ma = new MoodAnalyzer("I am in any mood");
			String mood1 = ma.analyseMood();
			assertEquals(mood1,"HAPPY");

		}
	}