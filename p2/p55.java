package p2;

 class parent {
    void par(){
        System.out.println("this is parent class");

    }
   
    
}
class p55 extends parent{
    void ch(){
        System.out.println("this is child class");
    }
    
    public static void main(String[] args) {
        p55 objc=new p55();
        parent objp=new parent();
        objp.par();
        objc.ch();

        
    }
}
