package yep;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Books implements Comparable<Books>
{
    private int id;
    private String name;
    private String author;

    public int compareTo(Books b)
    {
        return this.id- b.id ;

    }
    public Books(int id,String name,String author)
    {
        this.id=id;
        this.name=name;
        this.author=author;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }
}
class Author implements Comparator<Books>
{
    public int compare(Books m1, Books m2)
    {
        return m1.getAuthor().compareTo(m2.getAuthor());
    }
}

class Main
{
    public static void main(String[] args)
    {
        ArrayList<Books> list = new ArrayList<Books>();
        list.add(new Books(1, "AAAA", "AAAAA"));
        list.add(new Books(2, "BBBB", "BBBBB"));
        list.add(new Books(3, "CCCC", "CCCCC"));
        list.add(new Books(4, "DDDD", "DDDDD"));
        System.out.println("\nSorted by author");
        Author a = new Author();
        Collections.sort(list, a);
        for (Books b: list)
            System.out.println(b.getName() + " " +
                    b.getId() + " " +
                    b.getAuthor());


    }

}
