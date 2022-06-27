package handson;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class mainsort2 {


       private static List<customer> listOfCustomers() {
        	return Arrays.asList(
        			new customer("Shalini","11/20/1997",60),
        	        new customer("Yashi","12/12/2022",73),
        	        new customer("Mahi","09/03/2005", 37)
        			);
        		
        }

        
        public static void main(String args[]) {
        Comparator<customer> namecomp= Comparator.comparing(customer::getName);
        //Comparator<customer> datecomp= Comparator.comparing(customer::getDate);
        Comparator<customer> agecomp= Comparator.comparing(customer::getAge);
        
        List<customer> sorted= listOfCustomers().stream().sorted(namecomp.thenComparing(customer::getDate).thenComparing(agecomp)).collect(Collectors.toList());
       
        sorted.stream().forEach(System.out::println);
	}
}


