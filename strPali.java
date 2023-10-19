import java.lang.*;
import java.util.*;

class strPali
{
public static void main(String [] arg)
{
String str;
String res="";

Scanner sc = new Scanner(System.in);
str = sc.next();

for(int i=0;i<str.length();i++)
res = str.charAt(i) + res;

System.out.println(res);

if(str.equals(res))
System.out.print(str+" is palidrome");

else
System.out.print(str+" is not palidrome");

}
}