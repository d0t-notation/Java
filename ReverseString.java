import java.util.*; 
import java.io.*;

class Main {  
  public static String FirstReverse(String str) { 
  
    // code goes here   
    /* Note: In Java the return type of a function and the 
       parameter types being passed are defined, so this return 
       call must match the return type of the function.
       You are free to modify the return type. */
       String rev = "";
       for (int i = str.length() - 1; i >= 0; i--) {
           rev = rev + str.charAt(i);
       }
       
       str = rev;
    return str;
    
  } 
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(FirstReverse(s.nextLine())); 
  }   
  
}