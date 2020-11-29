package io.sudarshan;

import java.util.List;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
//Java 7 Solution
public class Excercise {

	public static void main(String[] arge) {
		List<Person> people = Arrays.asList(
				new Person("Sudarshan", "Phule", 99),
				new Person("Satyajit", "Phule", 89),
				new Person("abcd","Xyz",79),
				new Person("lmn", "Pqr", 9),
				new Person("www", "Ssl", 19)
				);
		//Sort list by last name
		Collections.sort(people, new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				return o1.getLastName().compareTo(o2.getLastName());
			}
		});
		
		//Create a method to print all elements in the list
		System.out.println("\nPrinting list with all elements sorted:");
		printAll(people);
		
		//	Create a method to print all people that have last name beginning with P
		//printLastNameBeginningWithP(people);
		System.out.println("\nPrinting list for Last name starting with P");
		printConditionally(people, new Condition() {
			public boolean test(Person p) {
				return p.getLastName().startsWith("P");
			}
		});
		System.out.println("\nPrinting list for First name starting with S");
		printConditionally(people, new Condition() {
			public boolean test(Person p) {
				return p.getFirstName().startsWith("S");
			}
		});
	}

	/*
	private static void printLastNameBeginningWithP(List<Person> people) {
		for(Person p : people) {
			if(p.getLastName().startsWith("P")) {
				System.out.println(p);
			}
		}
		
	}
*/
	private static void printConditionally(List<Person> people, Condition condition) {
		for(Person p : people) {
			if(condition.test(p)) {
				System.out.println(p);
			}
		}
	}

	private static void printAll(List<Person> people) {
		for(Person p : people) {
			System.out.println(p);
		}
		
	}
}
interface Condition{
	boolean test(Person p);
}