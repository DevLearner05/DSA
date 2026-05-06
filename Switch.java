import java.util.Scanner;               // this is import for the purpose of taking input by the user/client .

public class Switch {

    public static void main(String[] args) {
        
        Scanner  sc = new Scanner(System.in);
        System.out.println("Press 1 for Addition ");
        System.out.println("Press 2 for Subtraction");
        System.out.println("Press 3 for Multiplication ");
        System.out.println("Press 4 for Division");
        System.out.println("Press 5 for Modulus");

         int operator = sc.nextInt();
        
        //  enter no. 1 
        System.out.print("Enter the first number : ");
        int num1 = sc.nextInt();

        // enter no. 2
        System.out.print("Enter the second number : ");
        int num2 = sc.nextInt();

        switch(operator){
        
        case 1 : 
            System.out.println(num1 + num2);
            break;
        
        case 2 : 
            System.out.println(num1 - num2);
            break;
        
        case 3 :
            System.out.println(num1 * num2);
            break;
        
        case 4 : 
            System.out.println(num1 / num2);
            break;
        
        case 5 : 
            System.out.println(num1 % num2);
            break;
        
        default :
            System.out.println("Invalid input");
            break;
    
        }

        sc.close();
    }

    
}
