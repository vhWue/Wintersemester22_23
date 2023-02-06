package Klausur_Twotter;

import java.io.EOFException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
	
	public static void main(String[] args) {
		List<User> list = new ArrayList<>();
		
		list.add(new User("test345", "dftg454FDS"));
		list.add(new User("mustermann", "1234"));
		list.add(new User("Viktor", "50ad4"));
		
		UserManager manager = new UserManager();
		
		manager.serialize(list);
		List<User> userList = new ArrayList<>();;
		try {
			userList = manager.deserialize();
		} catch (RuntimeException e) {
			// TODO: handle exception
		}

		for (User user : userList) {
			System.out.println(user.getUsername()+"  "+ user.getPassword());
		}
		System.out.println("------------------");
		Collections.sort(userList);
		
		for (User user : userList) {
			System.out.println(user.getUsername()+"  "+ user.getPassword());
		}
		
		System.out.println(LocalDate.now());
	}

}
