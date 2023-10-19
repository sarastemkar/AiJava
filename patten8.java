import java.lang.*;

class patten8
{
public static void main(String [] args)
{
int i,j,s;

for(i=1;i<=3;i++)
{
for(s=1;s<i;s++)
{
System.out.print(" ");
}
for(j=3;j>=i;j--)
{
System.out.print("#");
}
System.out.println();
}
}
}