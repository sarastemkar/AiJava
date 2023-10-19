import java.lang.*;
public class typeCast
{
public static void main(String[] arg)
{
char s = 'A';
byte a;
int b;

/*a= s;  Gives error since Byte is 8 bits and char is 2 byte 16 bits makes its lossy conversion solution type cast 
System.out.println(a);*/

b=s;
System.out.println(b);

}
}