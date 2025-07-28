public class Learn {

	//static explanation
	
	//static variable - belongs to the class, shared by all instances
	//static method - can be called without creating an instance of the class
	//static block - executed when the class is loaded, used for initialization
	//static final variable - constant, cannot be changed, belongs to the class

	static int i = 10;
	static char ch = 'B'; 
	static final int j = 20; // constant, cannot be changed

	char c ='A';
	int n = 100;
	byte b = 67;
	float f = 97.5f;
	long l = 40L;
	double d = 50.5;

	//typecasting explanation
	
	//Type Casting - converting one data type to another
	//Implicit Casting (Automatic Conversion) - converting a smaller data type to a larger data type
	//Explicit Casting (Manual Conversion) - converting a larger data type to a smaller data type
	//Examples:

	//byte < short < int < long < float < double
	//char < int < long < float < double

	//values:
	//byte: -128 to 127
	//short: -32,768 to 32,767
	//int: -2,147,483,648 to 2,147,483,647

	//largerDataType m = smallerDataType = Automatic Conversion
	//smallerDataType m = largerDataType = Manual Conversion
	//long m = i; // Automatic Conversion
	//int m = l; // Manual Conversion
	//int m = (int)l; // Manual Conversion
	//byte b1 = i; // Manual Conversion
	//byte b1 = (byte)i; // Manual Conversion
	//byte b1 = n; // Manual Conversion
	//byte b1 = (byte)l; // Manual Conversion
	//byte b1 = (byte)i; // Manual Conversion
	//byte b1 = (byte)f; // Manual Conversion
	//byte b1 = (byte)d; // Manual Conversion
	//char c1 = (char)i; // Manual Conversion

	byte b1 = (byte)n;

	
	public static void main(String[] args) {
		System.out.println(" Hello Java!... ");

		Learn l = new Learn();

		System.out.println(l.c);
		System.out.println(l.b);
		System.out.println(i);
		System.err.println(l.f);
		System.out.println(l.l);
		System.out.println(l.d); // Accessing instance variable using object reference
		System.out.println(l.n); // Accessing instance variable using object reference

		System.out.println(Learn.i); // Accessing static variable using class name
		System.out.println(Learn.ch); // Accessing static variable using class name
		System.out.println(Learn.j); // Accessing static final variable using class name

		//Type Casting Examples
		System.out.println("Type Casting Examples:");
		System.out.println(l.b1);
		System.out.println((int)l.l); // Manual Conversion
		System.out.println((int)l.f); // Manual Conversion
		System.out.println((int)l.d); // Manual Conversion
		//System.out.println((char)l.i); // Manual Conversion
		System.out.println((char)l.b); // Manual Conversion
		System.out.println((char)l.f); // Manual Conversion

		// Unary operator examples
		unaryOperatorExamples();
	}

	//unary
	//Unary Operators - operate on a single operand
	//Unary operators include: +, -, ++, --, !, ~
	//Examples:
	public static void unaryOperatorExamples() {
		int a = 10;
		int b = ++a; // Unary plus operator
		int c = --a; // Unary minus operator
		boolean isTrue = !false; // Unary not operator
		int d = ~a; // Unary bitwise complement operator
		System.out.println(a); // 11
		System.out.println(b); // 11
		System.out.println(c); // 10
		System.out.println(isTrue); // true
		System.out.println(d); // -12 (bitwise complement of 11 is -12 in two's complement representation)
		System.out.println(a++); // Postfix increment operator
		System.out.println(++a); // Prefix increment operator
	}

}


//primitive - holds a single value

//byte, short, int, long, float, double, char, boolean
//byte b = 10;
//short s = 20;
//int i = 30;
//long l = 40L;
//float f = 50.5f;
//double d = 60.6;
//char c = 'A';
//boolean isTrue = true;

//non primitive - holds a multiple values

//String, Arrays, Classes, Interfaces, Enums, Collections
//String str = "Hello";
//int[] arr = {1, 2, 3, 4, 5};
//String str = new String("Hello");
//String str = "Hello";
//String str = new String("Hello");
//String str = "Hello";

//import java.util.ArrayList;
//ArrayList<String> list = new ArrayList<>();

//class MyClass {
//    int myField;
//    void myMethod() {
//        System.out.println("My method");
//    }
//}

//interface MyInterface {
//    void myMethod();
//}
//class MyClass implements MyInterface {
//    public void myMethod() {
//        System.out.println("My method implementation");
//    }
//}

//enum MyEnum {
//    VALUE1, VALUE2, VALUE3;
//    void myMethod() {
//        System.out.println("My enum method");
//    }
//}FileHandling
//MyEnum.VALUE1.myMethod();
//MyEnum e = MyEnum.VALUE1;
//System.out.println(e); // MyEnum.VALUE1
//System.out.println(MyEnum.VALUE1); // MyEnum.VALUE1	
//System.out.println(MyEnum.VALUE2); // MyEnum.VALUE2



//Methods
//Methods - blocks of code that perform a specific task
//Method Declaration - specifies the method's name, return type, and parameters
//Method Definition - provides the implementation of the method
//Method Call - invokes the method to execute its code
//Method Overloading - defining multiple methods with the same name but different parameters
//Method Overriding - redefining a method in a subclass that is already defined in its superclass
//Method Signature - consists of the method's name and parameter types
//Method Return Type - the data type of the value returned by the method
//Method Parameters - variables that accept values when the method is called
//Method Arguments - values passed to the method when it is called
//Method Invocation - calling a method to execute its code
//Method Scope - the visibility and lifetime of a method within a class
//Method Chaining - calling multiple methods in a single statement
//Method Recursion - a method that calls itself to solve a problem
//Method Documentation - comments that describe the method's purpose, parameters, and return value




//-----------------------------------------------



//callbyvalue - passing a copy of the value
//two types : pass variables and pass references
//callbyvalue - primitive data types (byte, short, int, long, float, double, char, boolean)
//callbyreference - passing a reference to the actual object
//callbyreference - non-primitive data types (String, Arrays, Classes, Interfaces,
// Enums, Collections)

//pass by value - primitive data types