import java.lang.*;
import java.util.*;

class specialnumber
{
public static void main(String [] args)
{

int num,no,r,i;
int fact;
int sum=0;

Scanner sc = new Scanner(System.in);

num = sc.nextInt();
no=num;

while(no!=0)
{
fact=1;
r=no%10;
no=no/10;
for(i=r;i>1;i--)
{
 
fact=fact*i;
}
sum=sum+fact;
}

if(sum==num)
{System.out.println("SpecialNumber "+sum);}
else
{System.out.println("NOT a sPecial Num"+sum);}

}
}
