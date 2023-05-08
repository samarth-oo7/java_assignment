package p2;
import java.util.Scanner;
public class areasq_rec {
    areasq_rec(int l)
    {
        int sq=l*l;
        System.out.println("areaof Square is:"+sq);
    }
    areasq_rec(int b, int w ){
        int area=b*w;
        System.out.println("Area of rectlangle:"+area);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ther the length of square:");
       int q=sc.nextInt();

       System.out.println("enter the length and width of rectangle:");
       int j=sc.nextInt();
       int k=sc.nextInt();

       areasq_rec obj=new areasq_rec(q);
       areasq_rec obj2=new areasq_rec(j, k);
        
      }
}
