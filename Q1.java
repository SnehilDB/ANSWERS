public class Q1
{


        public static void main(String[] args)

        {
            class Parent
            {

                void m1() throws RuntimeException
                {
                    System.out.println("parent m1");
                }


            }
            class C1 extends Parent
            {
                void m1() throws RuntimeException
                {
                    System.out.println("child m1");
                }

            }
            class C2 extends Parent
            {
                void m1() throws ArithmeticException
                {
                    System.out.println("child m1");
                }

            }


            Parent obj1=new Parent();
            Parent obj2=new C1();
            Parent obj3=new C2();

            obj1.m1();
            obj2.m1();
            obj3.m1();
        }
    }




