package mapJava;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;
public class testhash {

	
	 public static void main(String[] args) {
	      TreeSet<Double> set = new TreeSet<Double>();
	      set.add(12.52d);
	      set.add(-5d);
	      set.add(102.56d);
	      set.add(75d);
	      set.add(-52d);
	      //Vous pouvez voir que, malgré l'insertion dans le désordre
	      //L'affichage se fait dans l'ordre
	      System.out.println(set);
	      
	      Iterator<Double> it = set.iterator();
	      while(it.hasNext()){
	         Double d = it.next();
}


      }
   }
