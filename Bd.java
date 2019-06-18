package BD;

import java.math.BigDecimal;
import java.math.MathContext;

public class Bd
{
    public static void main(String[] args)
    {

        BigDecimal bg1,bg2,bg3;


        bg1 = new BigDecimal("40.732");
        bg2 = new BigDecimal("30.12");



        MathContext mc = new MathContext(4);
            bg3 = bg1.add(bg2,mc);


        System.out.println("Result is " + bg3);
    }

}
