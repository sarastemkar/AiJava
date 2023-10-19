import java.lang.*;
import java.util.*;
class mainmenu
{
public static void main(String [] args)
{
int choice;
Scanner sc = new Scanner(System.in);
System.out.println("For Factorial press 1 :");
System.out.println("For cube press 2:");
choice = sc.nextInt();

if(choice==1)
{
int number;
System.out.println("enter your number");
number = sc.nextInt();
System.out.println(factorial.fact(number));
}
if(choice==2)
{
int number;
System.out.println("enter your number");
number = sc.nextInt();
cube.cube(number);
}

}
}
