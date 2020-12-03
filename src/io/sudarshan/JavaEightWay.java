package io.sudarshan;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

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
			
			//Method to print all elements in the list
			System.out.println("\nPrinting list with all elements sorted:");
			performConditionally(people, p-> true, p -> System.out.println(p));
			
			//Method to print all people that have last name beginning with P
			System.out.println("\nPrinting list for Last name starting with P");
			performConditionally(people, p -> p.getLastName().startsWith("P"), p -> System.out.println(p));
			
			System.out.println("\nPrinting list for First name starting with S");
			performConditionally(people,p -> p.getFirstName().startsWith("S"), p -> System.out.println(p.getFirstName()));
	}
	private static void performConditionally(List<Person> people, Predicate<Person> predicate, Consumer<Person> consumer) {
		for(Person p : people) {
			if(predicate.test(p)) {
				consumer.accept(p);
			}
		}
	}
}	
