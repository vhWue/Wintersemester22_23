package Klausur_Twotter;

import java.time.LocalDate;

public class Message {
	private int charCounter;
	private String message;
	private String creationDate;
	
	
	public Message(String msg) {
		if(msg.length()<150) {
			this.message=msg;
		}else {
			this.message=msg.substring(0,140);
		}
		this.creationDate = LocalDate.now().toString();
	}
	public int getCharCounter() {
		return charCounter;
	}
	public void setCharCounter(int charCounter) {
		this.charCounter = charCounter;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}
	
	

}
