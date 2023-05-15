import java.util.Scanner;
public class Stringcon {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
      
        System.out.println("enter the string:");
        String s1=sc.next();
        System.out.println("enter another string:");
        String s2=sc.next();
        String s3=s1.concat(s2);
        System.out.println("required String is:"+s3);
        sc.close();


    }
    
}
