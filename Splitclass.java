package Splitsentence;

import java.util.HashMap;

public class Splitclass
{
    public static void main(String[] args) {
        String s1="This is a book and this is a pen";
        String[] all = s1.split("\\s");

        HashMap<String,Integer> al=new HashMap<>();
        for(String k : all)
        {
            if (al.containsKey(k))
            {
                al.put(k,al.get(k)+1);
            }
            else
            {
                al.put(k,1);
            }
        }

        System.out.println(al);

    }


}
