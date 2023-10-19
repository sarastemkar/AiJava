import static java.lang.System.out;
import java.util.*;

class post
{
public static void main(String[] arg)
{
int n = new Scanner(System.in).nextInt();

int b = n++;
int a = ++n;

out.println(b);
out.println(a);
out.println(n++);
}
}