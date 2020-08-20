package mapJava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	List<CD> list = new ArrayList<CD>();
	list.add(new CD ("Arcandiers","7$",7d));
	list.add(new CD("Frank Zappa","Tinseltown Rebellion", 10.25d));
	list.add(new CD("Frank Zappa","Bongo Fury",10.25d));
	list.add(new CD("King Crimson","Red",15.30d));
	list.add(new CD("Joe Zawinul","Word Tour", 12.15d));
	
	System.out.println("Avant le tri : ");
	Iterator<CD> it = list.iterator();
	while(it.hasNext())
		System.out.println(it.next());
	Collections.sort(list);
	
	System.out.println("Après le tri : ");
	it = list.iterator();
	while(it.hasNext())
		System.out.println(it.next());
	
	
	System.out.println("Après le tri avec notre comparateur");
    
    Collections.sort(list, new Comparator<CD>(){
       public int compare(CD cd1, CD cd2) {
          Double prix1 = (Double)cd1.getPrix();
          Double prix2 = (Double)cd2.getPrix();
          int result = prix1.compareTo(prix2);
          //dan
          if(result == 0){
             return cd1.compareTo(cd2);
          }
          return result;
       }
    });

    it = list.iterator();
    while(it.hasNext())
       System.out.println(it.next());
	

	}

}
