package handson;

import java.util.Comparator;



public class comparatorSorting implements Comparator<customer>{

	@Override
	public int compare(customer obj1, customer obj2) {
		
		int comparename= obj1.getName().compareTo(obj2.getName());
		int comparedate= obj1.getDate().compareTo(obj2.getDate());
		int compareage=obj1.getAge().compareTo(obj2.getAge());
		
		if(comparename==0) {
			return ((comparedate==0)? compareage: comparedate);
		}
		else{
			return comparename;
		}
	}

	

	 
}
