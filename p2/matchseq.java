package p2;
import java.util.Scanner;
public class matchseq {
    
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the sequence of string:");
        String s=sc.next();

        System.out.println("Enter the string:");
        String t=sc.next();
        char s1;
        char s2;

        if(s.length()==t.length())
        {
            for(int i=0;i<=s.length();i++)
            {
                 s1=s.charAt(i);
                 s2=t.charAt(i);

                 if(s1==s2){
                    System.out.println("true");
                }     
            
           
        }
        
        }
        else{
            System.out.println("false");
        }
        sc.close();
    }

    
}
