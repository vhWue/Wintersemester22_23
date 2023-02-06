package Klausur_Twotter;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class UserManager implements ObjectManager<User> {

	@Override
	public void serialize(List<User> objectList){
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("user.dat"))) {
			for (User user : objectList) {
				oos.writeObject(user);
			}
			oos.flush();
			
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

	@Override
	public List<User> deserialize() {
		List<User> userList = new ArrayList<>();

		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("user.dat"))){
			while(true) {
			Object obj = ois.readObject();
				if(obj instanceof User) {
					userList.add((User) obj);
				}
			}
		}
		catch(EOFException e) {
			
		}
		catch (IOException | ClassNotFoundException e) {
			throw new RuntimeException(e);
		}
		return userList;
	}
	

}
