package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution
{
    public static void main(String[] args)
    {
        int n;
        Scanner sc=new Scanner(System.in);

        n=sc.nextInt();

        ArrayList<ArrayList<Integer>> rows=new ArrayList<ArrayList<Integer>>();

        for(int i=0;i<n;i++)
        {
            int d=sc.nextInt();
            ArrayList<Integer> row=new ArrayList<>();
            for(int j=0;j<d;j++)
            {
                row.add(sc.nextInt());
            }
            rows.add(row);
        }
        int q=sc.nextInt();

        for(int k=0;k<q;k++)
        {
            int x=sc.nextInt();
            int y=sc.nextInt();
            //System.out.println(rows.get(x - 1).get(y - 1));
            try {
                System.out.println(rows.get(x - 1).get(y - 1));
            }
            catch(Exception e)
            {
                System.out.println("error");
            }

        }
    }


}
