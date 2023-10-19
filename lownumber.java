import java.lang.*;
import java.util.*;

class lownumber
{
public static void main(String [] arg)
{
Scanner sc = new Scanner(System.in);

int highest=99999;
int num=10;

while(num>0)
{
num--;

int n = sc.nextInt();
if(n<highest)
{
highest=n;
}

}

System.out.println(highest);

}}
