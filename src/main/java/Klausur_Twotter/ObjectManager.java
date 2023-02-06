package Klausur_Twotter;

import java.util.List;

public interface ObjectManager<T> {
	
	public void serialize(List<T> objectList);
	public List<T> deserialize();

}
