import java.lang.*;

class patten7
{
public static void main(String [] args)
{
int i,j,s;

for(i=1;i<=3;i++)
{
	for(s=3;s>i;s--)
	{
		System.out.print(" ");
	}
	
	for(j=1;j<=i;j++)
	{
		System.out.print("*");
	}
System.out.println();
}
}
}