package Klausur_Twotter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class TwotterSystem {
	private ArrayList<User> userArr = new ArrayList<>();
	private HashMap<User, ArrayList<Message>> map = new HashMap<>();
	
	public void addUser(User u) {
		userArr.add(u);
		map.put(u, new ArrayList<>());
	}
	
	public void addMessage(User u, Message m) {
		map.get(u).add(m);
	}
	
	public List<Message> getAllMessages(){
		ArrayList<Message> allMessages = new ArrayList<>();
		Set<User> keySet = map.keySet();
		for (User key : keySet) {
			for(int i=0;i<map.get(key).size();i++) {
				allMessages.add(map.get(key).get(i));
			}
		}
		return allMessages;
	}
	
	public List<Message> getAllMessagesFromUser(User u){
		ArrayList<Message> allMessages = new ArrayList<>();
		
		for(int i=0;i<map.get(u).size();i++) {
			allMessages.add(map.get(u).get(i));
		}
		return allMessages;
	}
	
	
	public List<Message> getAllMessagesFromDate(String date){
		
		ArrayList<Message> returnMessages =new ArrayList<>();
		List<Message> allMessages = getAllMessages();
		for (Message message : allMessages) {
			if(message.getCreationDate().equals(date)) {
				returnMessages.add(message);
			}
		}
		return returnMessages;
	}
	
	
	public void mapPrint() {
		Set<User> keySet = map.keySet();
		for (User user : keySet) {
			System.out.println("\nUsername: "+user.getUsername());
			System.out.println("Messages:");
			for (int i = 0; i < map.get(user).size(); i++) {
				System.out.println(map.get(user).get(i).getMessage());
			}
		}
	}
	
	public static void main(String[] args) {
		String msg = "Diese Zeile soll mehr als 150 Character haben, funktioniert es? Wir finden es heraus, Ob es wirklcih funktioniert? Wir wissen es erst wenn wir es ausuu";
		System.out.println(msg.length());
		TwotterSystem sys = new TwotterSystem();
		User u = new User("Thomas", "123");
		User u2 = new User("Fritz", "4523");
		sys.addUser(u);
		sys.addUser(u2);
		sys.addMessage(u, new Message("Hello World"));
		sys.addMessage(u, new Message("World World"));
		sys.addMessage(u2, new Message("Das ist eine neue World"));
		sys.addMessage(u2, new Message("Ich bin der Fritz"));
		sys.addMessage(u2, new Message(msg));
		Message msg2 = new Message("Das ist ein test für das Datum");
		msg2.setCreationDate("2018-01-31");
		sys.addMessage(u2, msg2);
		
//		sys.mapPrint();
		
		List<Message> a =  sys.getAllMessages();
		List<Message> d =  sys.getAllMessagesFromUser(u2);
		List<Message> m =  sys.getAllMessagesFromDate("2022-11-15");
		for (Message message : m) {
			System.out.println(message.getMessage()+" Date: " + message.getCreationDate());
		}
	}

}
