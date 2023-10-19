import java.lang.*;
import java.util.*;

class recursionrem
{
public static void main(String [] arg)
{
int n;
Scanner sc = new Scanner(System.in);
n = sc.nextInt();
int a =rem(n);
System.out.print(a);
}


public static int rem(int n)
{
int rem=0;
if(n!=0)
{
rem=n%10;
return rem+rem(n/10);
}

else
{return 0;}

}

}