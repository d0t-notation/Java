import java.util.*; 
import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Main {  
  public static String LongestWord(String sen) { 
  
    // code goes here   
    /* Note: In Java the return type of a function and the 
       parameter types being passed are defined, so this return 
       call must match the return type of the function.
       You are free to modify the return type. */
       
       Scanner scan = new Scanner(sen);
       Pattern p = Pattern.compile("[^A-Za-z0-9]");
       Matcher m;
       Boolean b;
       
       String longestWord = "";
       while (scan.hasNext()) {
           String nextWord = scan.next();
           m = p.matcher(nextWord);
           b = m.find();
           
           if (!b && nextWord.length() > longestWord.length()) {
               longestWord = nextWord;
           }
       }
       
    return longestWord;
    
  } 
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(LongestWord(s.nextLine())); 
  }   
  
}