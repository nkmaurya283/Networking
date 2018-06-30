package pages;

public class String123 {

    public static void main(String[]  args)
    {
        String a = "LOTUS";

        String str = "";
        for(int i=0; i<a.length(); i++)
        {
            str = a.substring(0, i+1);
            System.out.println(str);
        }
    }

}
