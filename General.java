package BOOKS;

import java.awt.print.Book;
import java.util.HashMap;
import java.util.Map;

public class General
{
    int id;
    String name,author,publisher;
    int quantity;
    public General(int id, String name, String author, String publisher, int quantity) {
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
        Map<String,General> map=new HashMap<String, General>();
        //Creating Books
         General b1=new General(101,"Let us C","Yashwant Kanetkar","BPB",8);
        General b2=new General(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);
        General b3=new General(103,"Operating System","Galvin","Wiley",6);
        //Adding Books to map
        map.put(b1.name,b1);
        map.put(b2.name,b2);
        map.put(b3.name,b3);

        //Traversing map
        for(Map.Entry<String, General> entry:map.entrySet()){
            String key=entry.getKey();
            General b=entry.getValue();
            System.out.println(key+" Details:");
            System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
        }
    }
}



