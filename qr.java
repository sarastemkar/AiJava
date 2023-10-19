import java.lang.*;
import java.util.*;

class qr
{
public static void main(String [] arg)
{
int a,b;

Scanner sc = new Scanner(System.in);

System.out.println("eneter number 1");
a = sc.nextInt();
System.out.println("enter number 2");
b = sc.nextInt();

if(b==0)
System.out.println("cannot divide by 0");

else
{
System.out.println("Remender is "+ a%b);
System.out.println("Qouint is "+ a/b);
}

}}