import java.lang.*;

class shape
{
private int w,h;

public int getw()
{
  return w;
}

public void setw(int w)
{
	this.w=w;
}

public int geth()
{
return h;
}

public void seth(int h)
{
this.h=h;
}
}

public class getset
{
public static void main(String arg [])
{
	shape s1 = new shape();
	s1.setw(90);
	s1.seth(10);
	System.out.println(s1.getw());
	System.out.println(s1.geth());
}
}