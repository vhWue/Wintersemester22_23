package Klausur_Twotter;

import java.io.Serializable;

public class User implements Serializable, Comparable<User>{

	private static final long serialVersionUID = -7599237623364259892L;
	private final String username;
	private final String password;
	
	public User(String username, String password) {
		this.username=username;
		this.password=password;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	@Override
	public int compareTo(User user) {
		return this.username.compareToIgnoreCase(user.username);
	}
	
	
	
	

}
