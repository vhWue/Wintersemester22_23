package L21_3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import L21_3.Tree.Element;

class TreeTest {

	
	static Tree<String> baum = new Tree<>();
	@BeforeAll  
	static void vorbereitung() {
		baum.einfuegen(new Element<>("Cool"));
		baum.einfuegen(new Element<>("Zylla"));
		baum.einfuegen(new Element<>("Garrett"));
		baum.einfuegen(new Element<>("Aaronson"));
	}
	
	@Test
	void erstesElement() {
		assertEquals(baum.erstesElement().getElement(), "Aaronson");
	}
	@Test
	void letztesElement() {
		assertEquals(baum.letztesElement().getElement(), "Zylla");
	}

}
