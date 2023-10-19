import java.lang.*;
import java.util.*;

class armstrong
{
public static void main(String [] args)
{

int num,no,r;

int sum=0;

Scanner sc = new Scanner(System.in);

num = sc.nextInt();
no=num;

while(no!=0)
{

r=no%10;
no=no/10;

sum=sum+(r*r*r);
}

if(sum==num)
{System.out.println("Armstrong Number "+sum);}
else
{System.out.println("NOT a sPecial Num"+sum);}

}
}
