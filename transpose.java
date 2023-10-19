import java.lang.*;
import java.util.*;

class transpose
{
public static void main(String [] arg)
{
int [][] a = {{1,2,3},{4,5,6},{7,8,9}};

int i,j,temp;

for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
{
System.out.print(a[i][j]);
}
System.out.println();
}

System.out.println();

for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
{
if(i<j)
{
temp=a[i][j];
a[i][j]=a[j][i];
a[j][i]=temp;
}
}}

for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
{
System.out.print(a[i][j]);
}
System.out.println();
}

}
}