import java.lang.*;
import java.util.*;

class threeseven
{
public static void main(String [] args)
{

int no;

Scanner sc = new Scanner(System.in);

no = sc.nextInt();

if(no%3==0 && no%7==0)
{
System.out.println("Three-Seven");
}

else if(no%3==0)
System.out.println("Three");

else if(no%7==0)
System.out.println("Seven");

else
System.out.println("number is not divisble by 3 nor 7");


}
}
