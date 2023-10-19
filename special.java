import java.lang.*;
import java.util.*;

class special
{

public static void main(String [] arg)
{
int num;
Scanner sc = new Scanner(System.in);

num=sc.nextInt();

int no,i,rem,sum,fact;
sum=0;
fact=1;
no=num;

while(no!=0)
{
rem=no%10;

for(i=1;i<=rem;i++)
{
fact=fact*i;
}
no=no/10;
sum=sum+fact;
fact=1;

}

if(sum==num)
System.out.print("special num "+sum);

else
System.out.print("not special "+sum);

}}
