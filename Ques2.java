package ques2;

import java.util.ArrayList;

public class Ques2
{
    public static void main(String[] args)
    {


        ArrayList<Integer> al=new ArrayList<>();


            for (int i = 2; i <= 100; i++)
            {
                int count=0;
                for (int j = 2; j <= i; j++)
                {
                    if (i % j == 0)
                    {
                        count++;
                    }

                }

                if(count<2)
                {
                    al.add(i);
                }

            }

        System.out.println(al);



    }
}

