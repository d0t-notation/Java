import java.util.*; 
import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Main {  
  public static String LongestWord(String sen) { 
  
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
    Scanner s = new Scanner(System.in);
    System.out.print(LongestWord(s.nextLine())); 
  }   
  
}