package pages;

public class Overloading {
    public void m1(int a){}
    private void m1(String b){}

    public static void main(String[]  args)
    {
        Overloading y=new Overloading();
        y.m1(2);

    }
}
