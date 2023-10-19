import java.lang.*;
import java.util.*;

class sqpoly
{
public static void main(String [] args)
{

int s1,s2,s3,s4;

Scanner sc = new Scanner(System.in);

s1 = sc.nextInt();
s2= sc.nextInt();
s3= sc.nextInt();
s4= sc.nextInt();

if(s1==s2 && s1==s3 && s1==4)  
{
System.out.println("Poly status one");
System.out.println("sq status is one");
}
else if(s1<=s2+s3+s4 && s2<=s1+s3+s4 && s3<=s1+s2+s4 && s4<=s2+s1+s3)
{
System.out.println("poly status one");
System.out.println("square status Zero");
}

else
{
System.out.println("poly status zero");
System.out.println("sq status zero");
}
}
}
