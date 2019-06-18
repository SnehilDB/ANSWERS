package Employee;

public class Employee {

    public static void main(String[] args) {
        System.out.println("Here is the initial avaialable ID: " +
                Employee.getNextID());

        Employee john, mary;



        mary=new Employee(34, 61563.67, "Mary Madeline");

        System.out.println("\nEmployee Name: "+ mary.getName() +
                "\nEmployee ID:   "+mary.getID());

        john=new Employee(44, 38762.87, "John Russell");


        System.out.println("\nEmployee Name: "+ john.getName() +
                "\nEmployee ID:   "+john.getID());

        System.out.println("Here is the next avaialable ID: " +
                Employee.getNextID());


    }
    private int age;
    private double salary;
    private String name;
    private int id;


    private static int nextID = 1;


    Employee(int age, double salary, String name) {
        this.age = age;
        this.salary = salary;
        this.name = name;

        id = nextID++;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public int getID() {
        return id;
    }

    public String getName() {
        return name;
    }


    public static int getNextID() {
        return nextID;
    }


}