package Functions;

import java.util.Scanner;

public class Functions {
    public static void main(String[] args) {  
        //Create integer object  
        System.out.print("Enter the desired input value: ");  
        Scanner readInput = new Scanner(System.in);        
          Integer i = readInput.nextInt();  
          readInput.close();  
          // Returned hash code value for this object   
          int hashValue = Integer.hashCode(i);  
          System.out.println("Hash code Value for object is: " + hashValue);  
          }
} 
