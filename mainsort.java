package handson;

import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class mainsort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<customer> listOfCustomers = new ArrayList<customer>();
		
        
        customer cust1 = new customer("Shalini","11/20/1997",60);
        customer cust2 = new customer("Yashi","12/12/2022",73);
        customer cust3 = new customer("Mahi","09/03/2005", 37);
        

        listOfCustomers.add(cust1);
        listOfCustomers.add(cust2);
        listOfCustomers.add(cust3);
       
        Collections.sort(listOfCustomers, new comparatorSorting());
        
        
        System.out.println("\n\nSorted order of Name -> City -> Age :-\n");
        for(customer customer : listOfCustomers) {
            System.out.println(customer);
        }
 

	}

}
