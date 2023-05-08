package p2;

import java.util.Scanner;
public class samestart {
public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    
    System.out.println("Enter the main string:");
    String m1=sc.next();
    
    System.out.println("Enter the another string:");
    String ch=sc.next();
    boolean startsWith = m1.startsWith(ch);
        
    if (m1.startsWith(ch)) {
        System.out.println("The main string starts with the check string.");
    } else {
        System.out.println("The main string does not start with the check string.");
    }
    
    sc.close();
}


    
}
