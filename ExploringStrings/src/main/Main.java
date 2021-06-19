package main;

public class Main {

	public static void main(String[] args) {
		String one = "hello";
		String two = "hello";
		
		System.out.println(one.equals(two));
		System.out.println(one == two);
		
		Integer i = 76;
		String three = i.toString().intern();
		String four = "76";
		
		System.out.println(three.equals(four));
		System.out.println(three == four); //although it gives false now if we don't use intern method, its possible that sometime in the future it might return true Reason:::string  de-duplication
		
	}

}
