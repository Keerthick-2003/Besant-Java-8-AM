public class Operators {
//     Operators
// Unary Operators - operate on a single operand
// Unary operators include: +, -, ++, --, !, ~
// Examples:

	public static void main(String[] args) {
		unaryOperatorsExample();
		binaryOperatorsExample();
		comparisonOperatorsExample();
		logicalOperatorsExample();
	}

	static void unaryOperatorsExample() {
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

	static void binaryOperatorsExample() {
		int a = 10;
		int b = 20;
		System.out.println(a + b); // 30
		System.out.println(a - b); // -10
		System.out.println(a * b); // 200
		System.out.println(a / b); // 0
		System.out.println(a % b); // 10
		System.out.println(a & b); // 0
		System.out.println(a | b); // 30
		System.out.println(a ^ b); // 30
		System.out.println(a << 2); // 40
		System.out.println(a >> 2); // 2
		System.out.println(a >>> 2); // 2
		// System.out.println(a && (b > 15)); // true // Error: cannot apply && to int and boolean
		// System.out.println(a || (b < 15)); // true // Error: cannot apply || to int and boolean
	}

	static void comparisonOperatorsExample() {
		int a = 10;
		int b = 20;
		System.out.println(a > b); // false
		System.out.println(a < b); // true
		System.out.println(a >= b); // false
		System.out.println(a <= b); // true
		System.out.println(a == b); // false
		System.out.println(a != b); // true

		System.out.println("Java" == "JS"); // false
		System.out.println("Java" != "JS"); // true
		System.out.println("Java" == "Java"); // true
		System.out.println("Java" != "Java"); // false
	}

// Bitwise Operators - operate on bits and perform bit-by-bit operations
// 1 = 0001 in binary
// 2 = 0010 in binary  
// 3 = 0011 in binary
// 4 = 0100 in binary   


    static void bitwiseOperatorsExample() {
        int a = 10; // 1010 in binary
        int b = 20; // 10100 in binary
        System.out.println(a & b); // Bitwise AND
        System.out.println(a | b); // Bitwise OR
        System.out.println(a ^ b); // Bitwise XOR
        System.out.println(~a); // Bitwise NOT
        System.out.println(a << 2); // Left shift
        System.out.println(a >> 2); // Right shift
        System.out.println(a >>> 2); // Unsigned right shift
    }  
	
// Logical Operators - used to combine multiple boolean expressions
// Logical operators include: &&, ||, !

	static void logicalOperatorsExample() {
		int a = 10;
		int b = 20;
		int noOfStudents = 200;
		System.out.println((a > 0) && (b > 15)); // true
		System.out.println((a > 0) || (b < 15)); // true
		System.out.println(!(a < b)); // false
		System.out.println((a > b) && (b > 15)); // false
		System.out.println((a < b) || (b < 15)); // true
		System.out.println((a == b) && (b != 20)); // false
		System.out.println((a != b) || (b == 20)); // true
		System.out.println((noOfStudents > 100) && (noOfStudents < 500)); // true
		System.out.println((noOfStudents < 100) || (noOfStudents > 500)); // false
		System.out.println((noOfStudents == 200) && (noOfStudents != 300)); // true
		System.out.println((noOfStudents != 200) || (noOfStudents == 300)); // true
		System.out.println(noOfStudents > 10 || noOfStudents > 20 && noOfStudents > 30);

		
	}
}
