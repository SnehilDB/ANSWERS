package Dupli;

import java.util.HashMap;
import java.util.Map;

public class Dupli
{
    int id;
    String name,author,publisher;
    int quantity;
    public Dupli(int id, String name, String author, String publisher, int quantity)
    {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.quantity = quantity;
    }
}


class MapExample {
    public static void main(String[] args) {
        //Creating map of Books
        Map<String, Dupli> map = new HashMap<String, Dupli>();
        //Creating Books
        Dupli b1 = new Dupli(101, "Let us C", "Yashwant Kanetkar", "BPB", 8);
        Dupli b2 = new Dupli(102, "Data Communications & Networking", "Forouzan", "Mc Graw Hill", 4);
        Dupli b3 = new Dupli(103, "Operating System", "Galvin", "Wiley", 6);
        //Adding Books to map
        map.put(b1.name, b1);
        map.put(b2.name, b2);
        map.put(b3.name, b3);
        map.put(b1.name, b1);

        //Traversing map
        for (Map.Entry<String, Dupli> entry : map.entrySet()) {
            String key = entry.getKey();
            Dupli b = entry.getValue();
            System.out.println(key + " Details:");
            System.out.println(b.id + " " + b.name + " " + b.author + " " + b.publisher + " " + b.quantity);
        }

        for (Object key1 : map.keySet()) {

            for (Object key2 : map.keySet()) {
                if (!key1.toString().equals(key2.toString())) {
                    Object x = map.get(key1);
                    Object y = map.get(key2);
                    if (x == y) {
                        map.remove(key2);
                    }
                }

            }


        }
    }}

