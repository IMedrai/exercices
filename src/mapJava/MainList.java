package mapJava;

import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class MainList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> list = new CopyOnWriteArrayList <String>();
	      list.add("a");
	      list.add("b");
	      list.add("c");
	      list.add("d");
	      
	      ListIterator<String> it = list.listIterator();
	      while(it.hasNext()){
	         System.out.println(it.next());
	         list.add("toto1");
	         list.add("toto2");
	      }
	      System.out.println(list);
	   }
	
	}


