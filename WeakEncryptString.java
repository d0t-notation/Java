import java.util.*; 
import java.io.*;
class Main {  
  public static String LetterChanges(String str) { 
    String modifiedString1 = "";
    String modifiedString2 = "";
    for (int i = 0; i < str.length(); i++) {
        int ascii = (int) str.charAt(i);
        if (ascii == 122) 
            ascii = 97;
        else if (ascii >= 97 && ascii < 122) 
            ascii++;
        modifiedString1 = modifiedString1 + (char) ascii;
    }
    for (int i = 0; i < modifiedString1.length(); i++) {
        int ascii = (int) modifiedString1.charAt(i);
        if (ascii == 97 || ascii == 101 || ascii == 105 || ascii == 111 || ascii == 117)
            ascii = ascii - 32;
        modifiedString2 = modifiedString2 + (char) ascii;
    }
    return modifiedString2;
  } 
  public static void main (String[] args) {     
    Scanner s = new Scanner(System.in);
    System.out.print(LetterChanges(s.nextLine())); 
  }   
}