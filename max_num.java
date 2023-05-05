import java.util.Scanner;
public class max_num {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the number:");
        int a=sc.nextInt();
       
        System.out.println("Enter the number:");
        int b=sc.nextInt();
       
        System.out.println("Enter the number:");
        int c=sc.nextInt();

        int max=(a>b?(a>c?a:c):(b>c?b:c));
        System.out.println("The greatest number is:"+max);
        sc.close();
    }
}
