package Q4;

public class Q4
{
    public static void main(String[] args)
    {
        String s1="suszkskkcloowppzpaasllalx";
        int[] count=new int[255];
        for (int i = 0; i < s1.length(); i++)
        {
            count[s1.charAt(i)]++;
        }

        char[] ch = new char[s1.length()];
        for (int i = 0; i < s1.length(); i++) {
            ch[i] = s1.charAt(i);
            int find = 0;
            for (int j = 0; j <= i; j++) {
                if (s1.charAt(i) == ch[j])
                    find++;
            }

            if (find == 1) {
                System.out.println("Number of Occurrence of " + s1.charAt(i) + " letter is:" + count[s1.charAt(i)]);
            }
        }


    }
}
