package L22_5;

import L22_5.Baum.Knoten;

public interface Visitor<T> {
	public void visit(Knoten<T> current);

}
