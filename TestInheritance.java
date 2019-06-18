package Inheritence;

public class TestInheritance
{


    public static void main(String[] args)
    {
        class Cars{
            void wheels(){System.out.println("4 wheels");}
        }
        class Sportscar extends Cars{
            void speed(){System.out.println("Speedy cars with 4 wheels");}
        }
        class Redsportscar extends Sportscar{
            void colour(){System.out.println("Red colour Speedy Cars");}
        }
     Redsportscar a=new Redsportscar();
     a.wheels();
     a.speed();
     a.colour();
    }

}
