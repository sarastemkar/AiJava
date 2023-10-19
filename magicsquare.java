import java.lang.*;
import java.util.*;

class magicsquare
{
public static void main(String [] arg)
{
int [][] a = { {1,1,1,1},{1,1,1,1},{1,1,1,1},{1,1,1,1} };
int r=3;
int sum=0;
int temp=0;
int flag=0;

while(r!=-1)
{
sum=sum+a[r][r];
r--;
}

for(int i=0;i<4;i++)
{
temp = temp+a[i][3-i];
}

if(temp==sum)
{



}
}

