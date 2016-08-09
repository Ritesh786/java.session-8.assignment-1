package gom.Samrat.Models;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ExLIst {

	public static void main(String[] args) {
		List <String>l= new ArrayList<>();
		l.add("Ram");
		l.add("Arpit");
		l.add("Gaurav");
		l.add("Ritesh");
	    l.add("Ram");
	    l.add("Zubin");
	    System.out.println(l);
		
		Iterator<String> it=l.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
		
		

	}

}
