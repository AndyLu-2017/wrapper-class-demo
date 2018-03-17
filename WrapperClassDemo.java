import java.util.*;
/**
 * This is a short program to demonstrate the difference between wrapper classes
 * and primitives.
 * 
 * @author Michael Ida
 *
 */
public class WrapperClassDemo {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		/*
		// Integer objects and int primitives are declared differently
		Integer intObject1 = Integer.valueOf(10);
		Integer intObject2 = Integer.valueOf(11);
		int intPrimitive1 = 12;
		int intPrimitive2 = 12;
		
		// Primitives and objects have a different syntax
		System.out.println("The value of intObject1 is " + intObject1.toString());
		System.out.println("The value of intPrimitive1 is " + intPrimitive1);
		
		if (intObject1.equals(intObject2)) {
			System.out.println("Objects are equal");
		} else {
			System.out.println("Objects not equal");
		}
		
		if (intPrimitive1 == intPrimitive2) {
			System.out.println("Primitives equal");
		} else {
			System.out.println("Primitives not equal");
		}
		
		// Integers can be used to convert Strings to numerical values
		Scanner scnr = new Scanner(System.in);
		System.out.println("Enter a new value for intObject2");
		String inputInt = scnr.next();
		// convert the string input to an Integer object
		intObject2 = Integer.parseInt(inputInt);
		System.out.println("intObject2's new value is " + intObject2.toString());
		
		// Convert an Integer object to a primitive (called "unboxing")
		int intPrimitive3 = intObject1.intValue();
		// Convert a primitive to an Integer object (called "boxing")
		Integer intObject3 = Integer.valueOf(intPrimitive1);
		*/
		System.out.print("Enter number of value to be sorted: ");
		Scanner scnr = new Scanner(System.in);
		Integer[] IntegerObjs = new Integer[Integer.parseInt(scnr.next())];
		for(int i = 0; i < IntegerObjs.length; i++) {
			System.out.print("Enter value (" + (i+1) + "): ");
			IntegerObjs[i] = Integer.parseInt(scnr.next());
		}
		//sort
		int n = IntegerObjs.length;
		Integer temp;
		for (int i = n - 2; i >= 0; i--) {
			for (int j = 0; j <= i; j++) {
				if (IntegerObjs[j].compareTo(IntegerObjs[j + 1]) > 0) {
					temp = IntegerObjs[j + 1];
					IntegerObjs[j + 1] = IntegerObjs[j];
					IntegerObjs[j] = temp;
				}
			}
		}
		for (int i = 0; i < IntegerObjs.length; i++) 
			System.out.println(IntegerObjs[i].toString());
	}
}
