import java.util.Scanner;
public class ascii {
public static void main(String[] args) {
    
    Scanner sc= new Scanner(System.in);
    System.out.println("enter any charcter");
     char a= sc.next().charAt(0);  
     int asci =a;
     System.out.println("Ascii valu of given charctar is:"+asci);
     sc.close();

}

    
}
