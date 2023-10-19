import java.lang.*;
import java.util.*;

class xyz
{
public static void main(String [] arg)
{
int num,rem,no;

int sum=0;
Scanner sc= new Scanner(System.in);

num=sc.nextInt();
int fact=1;
no=num;

while(no!=0)
{
rem=no%10;
for(int i=1;i<=rem;i++)
{
fact = i *fact;
sum=sum+fact;
fact=1;
}
no=no/10;

}

if(sum==num)
{
System.out.println("armstronnumber");
}
else
System.out.println("not a armstrong" + sum);


}}
