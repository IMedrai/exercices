package mapJava;

import java.util.HashMap;
import java.util.Map;

public class Main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, CD> map1 = new HashMap<Integer, CD>();
		map1.put(1, new CD("Arcandiers", "7€" , 7d));
		map1.put(3, new CD("Frank Zappa", "Tinseltown rebellion", 10.25d));
	    map1.put(5, new CD("Frank Zappa", "Bongo Fury", 10.25d));
	    map1.put(4, new CD("King Crimson", "red", 15.30d));
	    map1.put(2, new CD("Joe Zawinul", "World tour", 12.15d));

	}

}
