package pages;

import com.steadystate.css.parser.SACParserCSS1;

import java.util.Scanner;

public class Pattern12 {

    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);

        int rows=sc.nextInt();
        for(int i=1;i<=rows;i++){

            for (int j=1;j<=i;j++){

                System.out.print(j+"  ");

            }
            System.out.println();
        }
    }
}
