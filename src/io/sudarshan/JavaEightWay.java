package io.sudarshan;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class JavaEightWay {
	//Java 8 way
		public static void main(String[] arge) {
			List<Person> people = Arrays.asList(
					new Person("Sudarshan", "Phule", 99),
					new Person("Satyajit", "Phule", 89),
					new Person("abcd","Xyz",79),
					new Person("lmn", "Pqr", 9),
					new Person("www", "Ssl", 19)
					);
			//Sort list by last name
			Collections.sort(people, (p1, p2) -> p1.getLastName().compareTo(p2.getLastName()));			
			//Create a method to print all elements in the list
			System.out.println("\nPrinting list with all elements sorted:");
			printConditionally(people, p-> true);
			
			//	Create a method to print all people that have last name beginning with P
			//printLastNameBeginningWithP(people);
			System.out.println("\nPrinting list for Last name starting with P");
			printConditionally(people, p -> p.getLastName().startsWith("P"));
			
			System.out.println("\nPrinting list for First name starting with S");
			printConditionally(people,p -> p.getFirstName().startsWith("S"));
		}
		private static void printConditionally(List<Person> people, Condition condition) {
			for(Person p : people) {
				if(condition.test(p)) {
					System.out.println(p);
				}
			}
		}
}	
