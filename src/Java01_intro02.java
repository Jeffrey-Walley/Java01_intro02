// Java Type Casting
    // Widening Casting Automatically converts smaller types to larger type size
    // ie: byte -> short -> char -> int -> long -> float -> double

/* public class Java01_intro02 {
    public static void main(String[] args) {
        int myInt = 9;
        double myDouble = myInt; // Automatic casting: int to double

        System.out.println(myInt);      // Outputs 9
        System.out.println(myDouble);   // Outputs 9.0
    }

} */

// Narrowing Casting -- done Manually by placing the type in parentheses in front of the value

/* public class Java01_intro02 {
    public static void main(String[] args) {
        double myDouble = 9.78d;
        int myInt = (int) myDouble; // Manual casting: double to int

        System.out.println(myDouble);   // Outputs 9.78
        System.out.println(myInt);      // Outputs 9
    }
} */

/* Java Operators
Operators are used to perform operations on variables and values.

In the example below, we use the + operator to add together two values:
 int x = 100 + 50;
//the + operator is often used to add together two values, like in the example above,
//  it can also be used to add together a variable and a value, or a variable and another variable:
     int sum1 = 100 + 50;        // 150 (100 + 50)
     int sum2 = sum1 + 250;      // 400 (150 + 250)
     int sum3 = sum2 + sum2;     // 800 (400 + 400)  */

/* ARITHMETIC OPERATORS
    Arithmetic operators are used to perform common mathematical operations.


         +	Addition	Adds together two values	x + y
         -	Subtraction	Subtracts one value from another	x - y
         *	Multiplication	Multiplies two values	x * y
         /	Division	Divides one value by another	x / y
         %	Modulus	Returns the division remainder	x % y
         ++	Increment	Increases the value of a variable by 1	++x
         --	Decrement	Decreases the value of a variable by 1	--x    */

/* ASSIGNMENT OPERATORS
    Operator	                Example	                    Same As
        =	                    x = 5	                    x = 5
        +=	                    x += 3	                    x = x + 3
        -=	                    x -= 3	                    x = x - 3
        *=	                    x *= 3	                    x = x * 3
        /=	                    x /= 3	                    x = x / 3
        %=	                    x %= 3	                    x = x % 3
        &=	                    x &= 3	                    x = x & 3
        |=	                    x |= 3	                    x = x | 3
        ^=	                    x ^= 3	                    x = x ^ 3
        >>=	                    x >>= 3	                    x = x >> 3
        <<=	                    x <<= 3	                    x = x << 3
 */

/* Java Comparison Operators
Comparison operators are used to compare two values:

Operator	        Name	                    Example
==	                Equal to	                x == y
!=	                Not equal	                x != y
>	                Greater than	            x > y
<	                Less than	                x < y
>=	                Greater than or equal to	x >= y
<=	                Less than or equal to	    x <= y */

/* Java Logical Operators
Logical operators are used to determine the logic between variables or values:

Operator     Name	                     Description	                                    Example
&& 	     Logical and         Returns true if both statements are true	                    x < 5 &&  x < 10
|| 	     Logical or	         Returns true if one of the statements is true	                x < 5 || x < 4
!	     Logical not	     Reverse the result, returns false if the result is true	    !(x < 5 && x < 10)
*/



// JAVA STRINGS
 // strings are used to store text and need "" around the stored data

//STRING LENGTH -- .length()
    //a String in JAVA is an object which contains methods that can perform certain operations

 /*   String txt = "This here string";
    System.out.println("The length of the text String is: " + txt.length()); // will give the length of String 'txt'

// toUpperCase() and toLowerCase()
        String txt2 = "Hello World";
        System.out.println(txt2.toUpperCase());   // Outputs "HELLO WORLD"
        System.out.println(txt2.toLowerCase());   // Outputs "hello world"

/* Finding a Character in a String
  The indexOf() method returns the index (the position) of the first occurrence of a specified
    text in a string (including whitespace):
 */

  /*          String txt = "Please locate where 'locate' occurs!";
            System.out.println(txt.indexOf("locate")); // Outputs 7


/* STRING CONCATENATION
The + operator can be used between strings to combine them. This is called concatenation:  */
  /*          String firstName = "John";
            String lastName = "Doe";
            System.out.println(firstName + " " + lastName);
                System.out.println(firstName.concat(lastName)); // using .concat   */


/* JAVA Math

-Math.max(x, y) will find the highest value of x and y
    Math.max(5, 10);  // returns 10

-Math.min(x, y) will find the lowest value of x and y
    Math.min(5, 10);  // returns 5

-Math.sqrt(x)    method returns the square root
-Math.abs(x)     method returns the absolute positive of a value
-Math.random()   returns a random # between 0 (inclusive) and 1 (exclusive)
   to allow random numbers between 0 - 100 use the following forumla
            int randomNum = (int)(Math.random() * 101);  // random #s 0-100
 */




/* JAVA BOOLEANS  accept 'true' or 'false' value

    boolean isJavaFun = true;
    boolean isFishFun = false;
    System.out.println(isJavaFun); // Outputs 'true'
    System.out.println(isFishFun); // outputs 'false'

 */

/* Boolean Expression
A Boolean expression is a Java expression that returns a Boolean value: true or false.

You can use a comparison operator, such as the greater than (>) operator to find out
        if an expression (or a variable) is true:

    int x = 10;
    int y = 9;
    System.out.println(x > y); // returns 'true' because 10 is higher than 9

     -- simplified to:

   System.out.println(10 > 9); will return 'true' because 10 is higher than 9




 */

