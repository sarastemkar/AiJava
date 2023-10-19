import java.lang.*;
import java.util.*;

class array2d
{
public static void main(String [] args)
{
Scanner sc = new Scanner(System.in);

int i,j;
int r = sc.nextInt();
int c = sc.nextInt();
int [][] arr = new int[r][c];

for(i=0;i<r;i++)
{
for(j=0;j<c;j++)
{
arr[i][j]=sc.nextInt();
}
}

for(i=0;i<r;i++)
{
for(j=0;j<c;j++)
{
System.out.print(arr[i][j]);
System.out.print(" ");
}
System.out.println();
}

}}
