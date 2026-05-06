

// public class Nitya {
//     public static void main(String[] args) {                // (String args[]) || (String[] args[])
//         System.out.println("Hi, I'm a JAVA DEVELOPER.");
//         System.out.println("Hello World");

//         // ----------- Single line Comments ----------------

//         // here you enter your name 

//         /*
//          * -------------------- Multicomments -------------------
//          */

//     }

// }

//  ----------------------------------  Variables ----------------------

// Variables are like containers who fit and adjust their values or assign the values to it.
// integer -> int  (whole numeric values)
// float -> float   (stores decimal values)
// String ->  String (Object -> stores text || collectin of characters)
// char -> char  (single character or alphabets )
// bollean -> boolean (true or false || 0, 1)

// public class Nitya {
//     public static void main(String[] args) {
//         int no = 15;

//         System.out.println("------ It's Integer Value here ----");

//         System.out.println(no);

//         String name = "ANUPAM TIWARI";

//         System.out.println("---- Here is my name : -----");

//         System.out.println(name);

//         float decimal = 19.50f ;

//         System.out.println("---- Here is decimal value: -----");

//         System.out.println(decimal );

//         char character = 'a'; 

//         System.out.println("---------  here is charcter ----");

//         System.out.println(character); 

//         boolean value = true;

//         System.out.println("----------- Here is Booolean ------");

//         System.out.println( value);

//     }
// }

// public class Nitya {
//     public static void main(String[] args) {
//       int itemPrice = 50;
//       int shippingCost = 10;
//       int sum = itemPrice + shippingCost;
//       System.out.println(sum);

//       float sum2 = (float) sum;

//   System.out.println(sum2);

//     }
//   }

import java.util.Scanner;
public class Nitya {
  public static void main(String[] args) {
    
    
    
    //  -----------------------------------  TAking Input from the users ---------------------
    
    
    Scanner input = new Scanner(System.in);
    System.out.println("Enter your marks: ");
    int marks = input.nextInt();
    System.out.println("Your marks are: " + marks);
    
    input.close();
    
    
    
    
    
    
    // --------------------------------------- STrings ----------------------






    // String str = "  Harry Potter The goblet of the fire.     ";
    // System.out.println(str);
    // System.out.println(str.trim());
    // System.out.println(str.toUpperCase());
    // System.out.println(str.toLowerCase());

    // ----------- String COnacatination -----------------

// String n1 = "Nitya";
// String n2 = " Yadav";
// System.out.println("------- String concatianation using + operator --------");
// System.out.println(n1 + ' '+n2);

// System.out.println("------- String concatianation using concat() method--------");
// System.out.println(n1.concat(n2));

// -----------------------------------  STRING Special Characters -------------------------------------


// String statement = "Hi, My Name is "Anupam" Tiwari. ";
// String statement = "Hi, My Name is \\ Anupam \\ Tiwari. ";
// System.out.println(statement);



// ----------------------------------  JAVA MATHS ---------------------------
// System.out.println(Math.max(2.56, 3.56));
// System.out.println(Math.min(2.56, 3.56));
// System.out.println(Math.abs(-2.56));
// System.out.println(Math.ceil(2.56));
// System.out.println(Math.floor(2.56));
// System.out.println(Math.random());

// System.out.println(Math.pow(2 ,10));
// System.out.println(Math.sqrt(16));

 
// ------------------------------------------------------   IF ELSE STATEMENT -------------------------------------

// int x = 10;
// int y = 9;
// System.out.println(x > y); // returns true, because 10 is higher than 9  

// if (x > y) {
//   System.out.println("x is greater than y");  
// }
// else if (x < y) {
//   System.out.println("x is less than y");
// }
// else {
//   System.out.println("x is equal to y");
// }


// ----------------------------  short hand if else statement ------------------





  }
} 