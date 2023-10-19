import java.lang.*;
import java.util.*;

class selection
{
public static void main(String [] arg)
{

int i,j,tem;
int [] arr = new int[5];

Scanner sc = new Scanner(System.in);

for(i=0;i<5;i++)
arr[i]=sc.nextInt();

for(i=0;i<5;i++)
{
for(j=i+1;j<5;j++)
{
if(arr[i]>arr[j])
{
tem=arr[i];
arr[i]=arr[j];
arr[j]=tem;
}
}
}
for(i=0;i<5;i++)
System.out.print(arr[i]);


}}
