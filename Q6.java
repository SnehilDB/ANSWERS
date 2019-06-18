package Q6;

public class Q6
{
    public static void main(String[] args) {
        String s1="this is example for string token or delimeter using split method you can split";
        String[] items = s1.split(" ");
        int itemCount = items.length;
        System.out.println("The number of items is: " + itemCount);
    }
}
