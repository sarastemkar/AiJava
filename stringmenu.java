import java.lang.*;
import java.util.*;

class stringmenu
{
public static void main(String [] args)
{

Scanner sc = new Scanner(System.in);
int q=0;

while(q!=1)
{
System.out.println("Enter strings ");
String str1= sc.next();
String str2= sc.next();
System.out.println(compare.strcmp(str1,str2));
System.out.println("Press 1 to Quit");
q = sc.nextInt();

}
}
}