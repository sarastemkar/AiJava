import java.lang.*;
import java.util.*;

class rangeven
{
public static void main(String [] args)
{

int num,range;
Scanner sc = new Scanner(System.in);

num=sc.nextInt();
range=sc.nextInt();

if(num%2!=0)
num++;

for(int i=num;i<=range;i=i+2)
{
System.out.println(i);
}



}}
