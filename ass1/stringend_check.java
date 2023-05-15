import java.util.Scanner;
public class stringend_check {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
      
        System.out.println("enter the string:");
        String s1=sc.next();
        System.out.println("enter another string:");
        String s2=sc.next();
        int i=s1.length();
        int j=s2.length();
        System.out.println(i);
        int a=i-1;
        int b=j-1;
        char c1=s1.charAt(a);
        char c2=s2.charAt(b);

        if(c1==c2){
            System.out.println("yes,both string ends with same content");
        }

        else{
            System.out.println("both string ends with different content");
        }
        sc.close();

    }
    
}
