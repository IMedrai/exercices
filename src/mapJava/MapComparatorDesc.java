package mapJava;

import java.util.Comparator;
import java.util.Map;

public class MapComparatorDesc implements Comparator<Integer>{
	Map<Integer, CD> map;
	
	

	public MapComparatorDesc(Map<Integer, CD> map) {
		super();
		this.map = map;
	}



	@Override
	public int compare(Integer key1, Integer key2) {
		// TODO Auto-generated method stub
		return key2.compareTo(key1);
	}

}
