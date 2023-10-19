import static java.lang.System.out;
import java.util.*;

public class quotRem
{

public static void main(String[] arg)
{
int n;
int divisor;
int quont;
int rem;


out.print("Enter divident ");
n = new Scanner(System.in).nextInt();
System.out.print("enter Divisor ");
divisor = new Scanner(System.in).nextInt();

quont = n/divisor;
rem = n%divisor;

System.out.print("Quotient is "+ quont + " remember is " +rem);
}
}
