import java.lang.*;
import java.util.*;

class whilesum
{
public static void main(String [] args)
{

int num=1;
int sum=0;
Scanner sc = new Scanner(System.in);


while(num!=0)
{
num = sc.nextInt();
sum=sum+num;
}

System.out.println(sum);
}
}
