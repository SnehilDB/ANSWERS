package skandls;

public class abcd
{
    public void method(int num) throws Exception
    {
        System.out.println("Method start");
            if(num==12)
            {
                throw new Exception();
            }
        System.out.println("Method end");
    }
    }


  class Xyz
  {
    public static void main(String[] args)
    {
        int num = 12;
        abcd obj = new abcd();
        try
        {
            System.out.println("start to try");
            obj.method(num);
            System.out.println("End of try");
        }
        catch (Exception ex)
        {
            System.out.println("An Exception");
        }
        finally
        {
            System.out.println("Finally");
        }
        System.out.println("Good");
    }
}
