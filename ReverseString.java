import java.util.*; 
import java.io.*;

class Main {  
  public static String FirstReverse(String str) { 

       String rev = "";
       for (int i = str.length() - 1; i >= 0; i--) {
           rev = rev + str.charAt(i);
       }
       
       str = rev;
    return str;
    
  } 
  
  public static void main (String[] args) {   
    Scanner s = new Scanner(System.in);
    System.out.print(FirstReverse(s.nextLine())); 
  }   
  
}