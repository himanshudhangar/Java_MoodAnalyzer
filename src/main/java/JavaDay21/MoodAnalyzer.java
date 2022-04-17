package JavaDay21;

public class MoodAnalyzer {
	private String msg;
	
	 public MoodAnalyzer(String msg) {
	        this.msg = msg;
	    }
public String analyMood() {
	try {
        if (msg.contains("sad")) 
        {
            return "SAD";
        }
        else 
        {
            return "HAPPY";
         }
    } catch(Exception M) {
        return "HAPPY";
	}
}
}

   