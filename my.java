import java.lang.*;

class myclass
{
private int a,b,c;

myclass()
{
System.out.println("in default");
}

myclass(int a)
{
System.out.println("in 1 para const");
this.a =a;
}

myclass(int b,int c)

{
System.out.println("in 2x const");
this.b=b;
this.c=c;
}

}

public class my
{
public static void main(String arg [])
{
myclass s1= new myclass();
myclass s2=new myclass(30);
myclass s3=new myclass(40,50);
}
}
