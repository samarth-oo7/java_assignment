import java.util.Scanner;
public class string_chno {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    System.out.println("Enter any string:");
    String s=sc.next();
    System.out.println("enter position of char you want:");
    int p=sc.nextInt();
    char ch=s.charAt(p);
    System.out.println("your required charcter is:"+ch);
    sc.close();
    }
    
}
