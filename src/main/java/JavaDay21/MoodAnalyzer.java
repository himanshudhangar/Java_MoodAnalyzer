package JavaDay21;

public class MoodAnalyzer {
	private String msg;
	 public MoodAnalyzer() {
	    }
	 public MoodAnalyzer(String msg) {
	        this.msg = msg;
	    }
	 public String analyMood() throws Mood_Excepation {
	        try {
	            if(msg.contains("SAD")){
	                return "SAD";
	            }
	            return "HAPPY";
	        }catch (NullPointerException e){
	            return "HAPPY";
         }

	 }
}