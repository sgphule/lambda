package io.sudarshan.exception;

public class ThisReferenceExample {

	public void doProcess(int i, Process p) {
		p.process(i);
	}
	public static void main(String[] args) {
		ThisReferenceExample thisReferenceExample = new ThisReferenceExample();
		thisReferenceExample.doProcess(20, i -> {
				System.out.println("Value of i is:" + i);
				//System.out.println(this);   This will not work
			});
	}

}
