import java.lang.*;
import java.util.*;
 
class high3
{
public static void main(String [] arg)
{

int a,b,c;

System.out.println("enter 3 numbers ");

Scanner sc = new Scanner(System.in);

a=sc.nextInt();
b=sc.nextInt();
c=sc.nextInt();

if(a>b)
{
if(a>c)
{
System.out.println("number greater is "+a);
}
else
{System.out.println("number greater is "+c);}
}

else
{
if(b>c)
{
System.out.println("number greater is "+b);
}
else
{System.out.println("number greater is "+c);}
}

}}