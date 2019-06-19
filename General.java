package BOOKS;

import java.awt.print.Book;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.*;
import java.time.temporal.ChronoUnit;

//import static java.time.temporal.ChronoUnit.DAYS;

public class General
{
    Date fdate_issue;
    Date fdate_till;
    public int Book_id;
    public String Book_name;
    public String Book_issued_to;
    public String Book_issue_date;
    public String Book_till_date;
    public long fine;
    public long noOfDaysBetween;

   public General(int id,String Book_name,String Book_issued_to,String Book_issue_date,String Book_till_date)
   {
    this.Book_id=id;
    this.Book_name=Book_name;
    this.Book_issued_to=Book_issued_to;
    this.Book_issue_date=Book_issue_date;
    this.Book_till_date=Book_till_date;


   }

    public void format_date(String Book_issue_date,String Book_till_date) throws Exception
    {
       // SimpleDateFormat formatter=new SimpleDateFormat("dd/MM/yyyy");
        //fdate_issue=formatter.parse(Book_issue_date);
        //fdate_till=formatter.parse(Book_till_date);

        LocalDate fdate_issue = LocalDate.parse(Book_issue_date);
        LocalDate fdate_till = LocalDate.parse(Book_till_date);

        this.noOfDaysBetween = ChronoUnit.DAYS.between(fdate_issue,fdate_till);
        System.out.println((noOfDaysBetween));

    }
    public long fine()

    {



        if((noOfDaysBetween-10)>30)
        {
         fine=(noOfDaysBetween-10)*30;
        }
        else if(noOfDaysBetween-20>20)
        {
         fine=(noOfDaysBetween-20)*20;
        }
        else if(noOfDaysBetween-10>10)
        {
         fine=(noOfDaysBetween-10)*10;
        }
        else
        {
            System.out.println("no fine");
        }

        return fine;

    }



}
class Book_details
{

    public static void main(String[] args)
        {
          try {

              Scanner sc = new Scanner(System.in);
              System.out.println("Enter details");
              // String  vid=sc.next();

              Integer id = sc.nextInt();//Integer.parseInt(vid);
              String Book_name = sc.next();
              String Book_issued_to = sc.next();
              String Book_issue_date = sc.next();
              String Book_till_date = sc.next();


              General Book1 = new General(id, Book_name, Book_issued_to, Book_issue_date, Book_till_date);
              Book1.format_date(Book_issue_date, Book_till_date);
              System.out.println(Book1.fine());

              HashMap<Integer, General> hm = new HashMap<>();
              General b1 = new General(1, "A", "AA", "2017-07-29", "2017-09-29");
              General b2 = new General(2, "B", "BB", "2017-09-01", "2017-09-29");
              hm.put(1, b1);
              hm.put(2, b2);

              for (Map.Entry<Integer, General> entry : hm.entrySet()) {
                  int key = entry.getKey();
                  General b = entry.getValue();
                  System.out.println(key + " Details:");
                  System.out.println(b.Book_id + " " + b.Book_name + " " + b.Book_issued_to + " " + b.Book_issue_date + " " + b.Book_till_date);

              }
          }

              catch (Exception e){
              e.printStackTrace();
          }



        }
}
