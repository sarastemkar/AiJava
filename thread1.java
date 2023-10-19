import java.lang.*;

class thread1 extends Thread
{


public void run()
{
System.out.println(Thread.currentThread());
for(int i =0;i<5;i++)
{
try
{
Thread.sleep(100);
}
catch(Exception e)
{
	e.printStackTrace();
}
System.out.println(i);
}
}

public static void main(String args [])
{

thread1 t1 = new thread1();
thread1 t2 = new thread1();
t1.setName("First");
t2.setName("second");
t1.start();
t2.start();
System.out.println(Thread.currentThread());
}
}
		