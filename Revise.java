package Revise;

import java.util.Scanner;

public class Revise
{
    public static void main(String[] args)
    {
    String s1;
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter String");
        s1=sc.next();

        for(int i=0;i<s1.length();i++)
        {
            if(s1.charAt(i)=='a' || s1.charAt(i)=='A' || s1.charAt(i)=='e' || s1.charAt(i)=='E' || s1.charAt(i)=='i' || s1.charAt(i)=='I' || s1.charAt(i)=='o' || s1.charAt(i)=='O' || s1.charAt(i)=='u' || s1.charAt(i)=='U' )
            {
                System.out.println(s1.charAt(i));
            }

        }






    }
}
