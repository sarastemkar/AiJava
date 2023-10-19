import java.lang.*;
import java.util.*;

class marks
{
public static void main(String [] args)
{

int marks;

Scanner sc = new Scanner(System.in);

marks = sc.nextInt();

if(marks>=75)
{
System.out.println("A");
}
else if(marks>=55)
{
System.out.println("B");
}
else if(marks>=35)
{
System.out.println("C");
}
else
{
System.out.println("Fail");
}

}}