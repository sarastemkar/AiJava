//declare two numbers and one operator as a character. e.g. '+'
//using switch... case check which operator is declared and accordingly //perform the action. 

import java.lang.*;
import java.util.*;

class table1
{
public static void main(String [] args)
{
int a,b;
char ch='+';

Scanner sc = new Scanner(System.in);
a=sc.nextInt();
b=sc.nextInt();
ch=sc.next().charAt(0);

switch(ch)
{
case '+':System.out.println(a+b);
	break;

case '-':System.out.println(a-b);
	break;
	
case '/':if(b==0)
	{System.out.println("a cannot be zero"); break;} 
	else{System.out.println(a/b);}
	break;
case '*':System.out.println(a*b);
	break;
default:System.out.println("invaild operator");
}
}
} 