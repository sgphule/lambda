package io.collections;

public class MethodReferenceCollecetionsExample {

	public static void main(String[] args) {
		Thread t = new Thread(() -> printMessage());
		t.start();
	}
	public static void printMessage() {
		System.out.println("Hello");
	}
}
