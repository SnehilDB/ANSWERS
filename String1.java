package String1;

import java.util.HashMap;

public class String1
{
    public static void main(String[] args) {
        String s1 = "abcdabcd";
        char[] all=new char[s1.length()];

        for(int i=0;i<s1.length();i++)
        {
            all[i]=s1.charAt(i);

        }

        HashMap<Character, Integer> al = new HashMap<>();


        for (Character k : all) {
            int count=0;
            if (al.containsKey(k)) {
                al.put(k, al.get(k) + 1);
             if(al.get(k)+1==2)
             {
               count++;
               if(count==2)
               {
                   System.out.println(al.get(k));
               }
             }
            }
           }
        }


    }



