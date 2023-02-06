package L21_4;

public class Question {
	private String text;  //FragenText
	
	
	public static Question toQuestion(String line) {
		Question q = new Question();
		q.text = line;	
		return q;
		
	}
	
	public String getText() {
		return text;
	}

}
