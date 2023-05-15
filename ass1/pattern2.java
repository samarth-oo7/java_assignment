public class pattern2 {
    public static void main(String[] args) {
        int i=1;
        int num=1;
        while(i<=5){
         
            int j=1;
            while(j<=i){
                System.out.print(num);
                j=j+1;
                num++;
            }
            System.out.println();
            i=i+1;

        }
        num++;
    }
    
}


