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
this.a =a;
}

myclass(int b,int c)
{
this.b=b;
this.c=c;
}

}

public class myClass
{
public static void main(String arg [])
{
myclass s1= new myclass();
myclass s2=new myclass(30);
myclass s3=new myclass(40,50);
}
}
