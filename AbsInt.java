package AI;

public class AbsInt
{
    interface A
    {
        void a();
        void b();
        void c();
    }


    public static void main(String[] args)
    {

        abstract class B implements A
        {
            public void c()
            {
                System.out.println("c done");
            }
        }
        class C extends B
        {
            public void a()
            {
                System.out.println("a done");
            }
            public void b()
            {
                System.out.println("b done");
            }
        }
        A obj=new C();
        obj.a();
        obj.b();
        obj.c();

    }
}
