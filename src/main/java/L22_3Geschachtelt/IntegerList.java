package L22_3Geschachtelt;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class IntegerList implements Serializable{
	private static final long serialVersionUID = 7329549632090391224L;
	
	private List<Integer> list;

	public List<Integer> getList() {
		return list;
	}
	
	public IntegerList(List<Integer> l) {
		this.list=l;
	}

}
