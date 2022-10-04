package com.ruby.java.ch11;

public class Test01 {

	public static void main(String[] args) {
		
		try {
//			int[] arr = new int[3];
//			arr[3] = 30;
//			System.out.println("OK");
			System.out.println(30/0);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
//			System.out.println(e.toString());
//			System.out.println(e.getLocalizedMessage());
//			System.out.println(e.hashCode());
//			System.out.println(e.getCause());
		
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			int[] arr = new int[3];
			arr[3] = 30;
			System.out.println("OK");
//			System.out.println(30/0);
		} catch(Exception e) {
			System.out.println(e.getMessage());
   		}
	}

}

// NullPointException
// IndexOutOfBoundsException
// ClassNotFoundException
// NoSuchFieldException
// NoSuchMethodException
// IOException
// NumberFormatException
// ArithmeticException
