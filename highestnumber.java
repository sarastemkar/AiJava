import java.lang.*;
import java.util.*;

class highestnumber
{
public static void main(String [] arg)
{
Scanner sc = new Scanner(System.in);

int highest=0;
int num=10;

while(num>0)
{
num--;

int n = sc.nextInt();
if(n>highest)
{
highest=n;
}

}

System.out.println(highest);

}}
