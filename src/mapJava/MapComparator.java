package mapJava;

import java.util.Comparator;
import java.util.Map;

public class MapComparator implements Comparator<Integer>{
	
	Map<Integer, CD> map;
	

	public MapComparator(Map<Integer, CD> map) {
		super();
		this.map = map;
	}


	@Override
	public int compare(Integer key1, Integer key2) {
		CD cd1 = map.get(key1);
		CD cd2 = map.get(key2);
		// TODO Auto-generated method stub
		return cd1.compareTo(cd2);
	}
	
	
	/*
	 * Map<Integer, CD> map;
   public MapComparator(Map<Integer, CD> map){
      this.map = map;
   }
   
   @Override
   public int compare(Integer key1, Integer key2) {
      CD cd1 = map.get(key1);
      CD cd2 = map.get(key2);
      return cd1.compareTo(cd2);
   }
	 */

}
