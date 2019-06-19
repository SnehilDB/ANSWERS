package BOOKS;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;
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
          try{

              Scanner sc=new Scanner(System.in);
              System.out.println("Enter details");
             // String  vid=sc.next();

              Integer id =  sc.nextInt();//Integer.parseInt(vid);
              String Book_name=sc.next();
              String Book_issued_to=sc.next();
              String Book_issue_date=sc.next();
              String Book_till_date=sc.next();
              General Book1=new General(id,Book_name,Book_issued_to,Book_issue_date,Book_till_date);
              Book1.format_date(Book_issue_date,Book_till_date);
              System.out.println(Book1.fine());

          }
          catch (Exception e){
              e.printStackTrace();
          }



        }
}
