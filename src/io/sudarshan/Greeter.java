package io.sudarshan;

public class Greeter {
	public void greet(Greeting greeting ) {
		greeting.perform();
	}
	public static void main(String[] args) {
		Greeter greeter = new Greeter();
		HelloWorldGreeting helloWorldGreeting = new HelloWorldGreeting();
		Greeting lambdaGreeting = () -> System.out.println("Hello world");
		Greeting innerClassGreeting = new Greeting() {
			public void perform() {
				System.out.println("Hello World");
			}
		};
		
		greeter.greet(helloWorldGreeting);//helloWorldGreeting.perform();
		greeter.greet(lambdaGreeting);//lambdaGreeting.perform();
		greeter.greet(innerClassGreeting);//innerClassGreeting.perform();
		
	}
}