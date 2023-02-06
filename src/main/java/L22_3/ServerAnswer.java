package L22_3;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Set;

public class ServerAnswer implements Serializable{

	private static final long serialVersionUID = 2259057028310831414L;
	private HashMap<Integer, Boolean> answer = new HashMap<>();
	
	public HashMap<Integer, Boolean> getAnswer() {
		return answer;
	}
	
	
	public void ausgabe() {
		Set<Integer> keySet = answer.keySet();
		
		for (Integer integer : keySet) {
			System.out.println(integer+ " -> "+answer.get(integer));
		}
	}
	
	

}
