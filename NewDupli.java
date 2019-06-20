package NewDupli;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;

public class NewDupli
{
    int id;
    String name,author,publisher;
    int quantity;

    public NewDupli(int id, String name, String author, String publisher, int quantity)
    {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.quantity = quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NewDupli newDupli = (NewDupli) o;
        return id == newDupli.id &&
                quantity == newDupli.quantity &&
                Objects.equals(name, newDupli.name) &&
                Objects.equals(author, newDupli.author) &&
                Objects.equals(publisher, newDupli.publisher);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, author, publisher, quantity);
    }
}

class MapExample {
    public static void main(String[] args) {
        //Creating map of Books
        Map<String, NewDupli> map = new HashMap<String, NewDupli>();
        //Creating Books
        NewDupli b1 = new NewDupli(101, "Let us C", "Yashwant Kanetkar", "BPB", 8);
        NewDupli b2 = new NewDupli(102, "Data Communications & Networking", "Forouzan", "Mc Graw Hill", 4);
        NewDupli b3 = new NewDupli(103, "Operating System", "Galvin", "Wiley", 6);
        NewDupli b4 = new NewDupli(101, "Let us C", "Yashwant Kanetkar", "BPB", 8);

        //Adding Books to map
        map.put(b1.name, b1);
        map.put(b2.name, b2);
        map.put(b3.name, b3);
        map.put(b1.name, b1);
        map.put(b4.name,b4);

        //Traversing map
        for (Map.Entry<String, NewDupli> entry : map.entrySet()) {
            String key = entry.getKey();
            NewDupli b = entry.getValue();
            System.out.println(key + " Details:");
            System.out.println(b.id + " " + b.name + " " + b.author + " " + b.publisher + " " + b.quantity);
        }


         if(b1.equals(b4))
         {
             System.out.println(b1.hashCode());
             System.out.println(b4.hashCode());
         }

        HashSet<NewDupli> hs=new HashSet();
         hs.add(b1);
         hs.add(b2);
         hs.add(b3);
         hs.add(b4);

         for(NewDupli k:hs)
         {
             System.out.println(k.publisher);
         }


    }}
