package pages;

public class X {
    int i;
    X( int i){
        this.i = i;
        System.out.println("Rinku is my wife");

    }

    static
    {System.out.println("Static");}


   // static int s = 7;

    public static void main(String args[]){
       // static int s1 =7;
        System.out.println("Xyx");

        X t = new X(8);
        t.test();

     //   static



    }



    static
    {System.out.println("Static1");}

    void test()
    {System.out.println("Test method");}

}
