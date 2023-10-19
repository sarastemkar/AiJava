import java.lang.*;
import java.util.*;

class tables
{
public static void main(String [] arg)
{

Scanner sc=new Scanner(System.in);
int n = sc.nextInt();
int i;
int j;
for(i=1;i<=10;i++)
{
for(j=2;j<=n;j++)
{
int mul=i*j;
System.out.print(j+" * "+i+" = "+ mul);
}
System.out.println();
}
}
}