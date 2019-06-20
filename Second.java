package Second;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class Second
{
    public static void main(String[] args) {
        String s1="aawwwwsnzhdsjhkc";
        char[] arr= s1.toCharArray();

        LinkedHashMap<Character,Integer> al=new LinkedHashMap<>();
        ArrayList<Character> list=new ArrayList<>();

        for(Character k : arr)
        {

            if (al.containsKey(k))
            {
                al.put(k,al.get(k)+1);
                if(al.get(k)==2)
                {
                    list.add(k);
                }
            }
            else
            {
                al.put(k,1);
            }
        }


        System.out.println(list);
        int c=0;
        for(Character k:list)
        {
            if(al.get(k)==2)
            {
             c++;
            }
            if(c==2)
            {
                System.out.println(k);
                    break;
            }

        }





    }

}
