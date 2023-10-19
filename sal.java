import java.lang.*;
import java.util.*;

class sal
{
public static void main(String [] arg)
{
char gen;
int sal;

Scanner sc = new Scanner(System.in);

System.out.println("Enter gender");
gen = sc.next().charAt(0);

System.out.println("enter  salarty");
sal =sc.nextInt();


if(gen=='m')
{
if(sal>8000)
{
System.out.println("net sal is "+ (sal-(sal*0.05)));
}
else
{
System.out.println("net sal is "+ (sal-(sal*0.02)));
}
}

if(gen=='f')
{
if(sal>5000)
{
System.out.println("net sal is "+ (sal-(sal*0.03)));
}
else
{
System.out.println("net sal is "+ (sal-(sal*0.01)));
}
}

}}
