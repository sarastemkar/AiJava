import java.lang.*;
import java.util.*;

class numberPatten1
{

public static void main(String[] arg)
{
int i,j,s,r,n;
Scanner sc=new Scanner(System.in);
System.out.println("Enter number");
n=sc.nextInt();

for(i=1;i<=n;i++)
{
for(s=n;s>i;s--)
System.out.print(" ");

for(j=1;j<=i;j++)
System.out.print(j);

for(r=i-1;r>=1;r--)
System.out.print(r);

System.out.println();
}
}

}