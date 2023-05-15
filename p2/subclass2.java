package p2;
  
abstract class parent{
  abstract  public void method();
}
class subclass1 extends parent{
    public void method(){
        System.out.println("this is  first subclass");

    }
}
class subclass2 extends parent{
    public void method(){
        System.out.println("this is  second subclass");
        

    }
    public static void main(String[] args) {
        subclass1 obj=new subclass1();
        subclass2 obj2=new subclass2();
        obj.method();
        obj2.method();
    }
}

