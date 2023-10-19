import java.lang.*;
import java.util.*;

class vowels
{
public static void main(String [] args)
{
char a ;

Scanner sc = new Scanner(System.in);

a = sc.next().charAt(0);

if((a>='a'&&a<='z')||(a>='A'&&a<='Z'))
{
if(a=='a'||a=='e'||a=='i'||a=='o'||a=='u'||a=='A'||a=='I'||a=='O'||a=='U')
{
System.out.println(a+" is a vowel");
}
else
{
System.out.println(a+"is not a vowel");
}
}
else
System.out.println("input a valid character");
}
}