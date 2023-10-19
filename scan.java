import java.lang.*;
import java.util.*;

public class scan
{


public static void main(String [] args)
{
int a;
char b;
float c;
double d;
byte e;
 Scanner sc = new Scanner(System.in);
 a = sc.nextInt();
b=sc.next().charAt(0);
c = sc.nextFloat();
d=sc.nextDouble();
e=sc.nextByte();

System.out.print(a+" "+b+" "+c+" "+d+" "+e);
}
}




