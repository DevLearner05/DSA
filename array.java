// -----------------------------   Array -------------------------

/*  

Array is help us to store the data, value in a contiguous manner 
 
note : all the data are the similar means saara  data jo hai wo same hona chahiye (same Data Type).
*/


public class array {

public static void main(String[] args) {
    
// Method 1 :
    int [] array_name = {1,2,3,4};
    System.out.println(array_name[2]);


// 2D Array 
    int [][] no = {{1,2 ,3} , {4,5,6,}};
    System.out.println(no[1][2]);



    System.out.println("----------------------------------------------------");
    // Method 2 : 
    int [] name = new int[4];
    name[0] = 1;
    name[1] = 2;
    name[2] = 3;
    name[3] = 4;
    System.out.println(name[2]);


    int [][] nom = new int[3][3];
    nom[0][0] = 1;
    nom[0][1] = 2;
    nom[0][2] = 3;

System.out.println(nom[0][2]);




}


    
}
